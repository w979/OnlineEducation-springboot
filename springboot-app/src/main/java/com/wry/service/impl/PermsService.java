package com.wry.service.impl;

import com.wry.dao.PermsDao;
import com.wry.pojo.Perms;
import com.wry.service.IPermsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional //事务控制
public class PermsService implements IPermsService {

    @Resource
    private PermsDao permsDao;

    /**
     * 获取用户菜单列表 +组合菜单列表
     * @param username
     * @return
     */
    @Override
    public List<Perms> findUserMenuByName(String username) {
        //所有的菜单
        List<Perms> permsList = permsDao.findMenu(username);
        //一级菜单 first
        List<Perms> first = new ArrayList<>();
        if (permsList != null && permsList.size() > 0) {
            //存储一级菜单
            for (Perms p : permsList) {
                if (p.getParentid() == null) {
                    first.add(p);
                }
            }
        }

        //遍历一级菜单
        for (Perms f : first) {
            List<Perms> childrenList = new ArrayList<>();
            //遍历所有菜单
            for (Perms p : permsList) {
                //找是否有与一级菜单相等的id
                if (f.getId() == p.getParentid()) {
                    childrenList.add(p);
                }
            }
            //向一级菜单存储二级菜单
            f.setChildrensList(childrenList);
        }

        return first;
    }

    /**
     * 获得所有的权限+组合权限树
     *
     * @return
     */
    @Override
    public List<Perms> findPerms() {
        //所有权限
        List<Perms> permsList = permsDao.findPerms();

        if (permsList.size() < 0) {
            return null;
        }

        //获得所有一级权限节点
        List<Perms> rootPermsList = new ArrayList<>();
        for (Perms perms : permsList) {
            if (perms.getParentid() == null){
                rootPermsList.add(perms);
            }
        }

        //根据一级节点获得子权限节点
        for (Perms root : rootPermsList) {
        root.setChildrensList(getChildrenNode(root.getId(), permsList));
        }

        return rootPermsList;
    }

    /**
     * 获得子权限节点
     */
    public List<Perms> getChildrenNode(Integer id,List<Perms> permsList){
        //找一级权限节点的所有子权限节点
        List<Perms> childrenList = new ArrayList<>();
        for (Perms perms : permsList) {
            if (id == perms.getParentid()){
                childrenList.add(perms);
            }
        }

        //找子权限节点是否还有子节点
        for (Perms children : childrenList) {
            //递归调用寻找子节点
            children.setChildrensList(getChildrenNode(children.getId(), permsList));
        }

        if(childrenList.size()==0){
            return null;
        }

        return childrenList;
    }

    /**
     * 获得指定用户的权限信息
     * @param userid
     * @return
     */
    @Override
    public List<Integer> getUserPerms(Integer userid) {
        return permsDao.getUserPerms(userid);
    }

    /**
     * 删除当前用户的所有权限
     * @param userid
     * @return
     */
    @Override
    public int delUserPerms(Integer userid) {
        return permsDao.delUserPerms(userid);
    }

    /**
     * 添加权限
     * @param permsIds
     * @return
     */
    @Override
    public int saveUserPerms(List<String> permsIds,Integer userid) {
        //当前用户的权限删除成功
        if (delUserPerms(userid) >= 0 ){
            //批量添加权限
            return permsDao.saveUserPerms(permsIds, userid);
        }else {
            //权限添加失败
            return -1;
        }
    }
}
