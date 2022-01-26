package com.wry.service;

import com.wry.pojo.Perms;

import java.util.List;

public interface IPermsService {
    //获取指定用户菜单列表
    List<Perms> findUserMenuByName(String username);

    //获得所有的权限
    List<Perms> findPerms();

    //获得指定用户的权限信息
    List<Integer> getUserPerms(Integer userid);

    //删除当前用户的所有权限
    int delUserPerms(Integer userid);
    
    //添加权限
    int saveUserPerms(List<String> permsIds,Integer userid);
}
