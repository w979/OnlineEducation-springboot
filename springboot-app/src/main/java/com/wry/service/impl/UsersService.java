package com.wry.service.impl;

import com.wry.dao.UsersDao;
import com.wry.pojo.Users;
import com.wry.service.IPermsService;
import com.wry.service.IUsersService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UsersService implements IUsersService {
    @Resource
    private UsersDao usersDao;

    @Resource
    private IPermsService permsService;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<Users> findUsers(String name) {
        return usersDao.queryUser(name);
    }

    /**
     * 添加用户
     * @param users
     * @return
     */
    @Override
    public int saveUsers(Users users) {
        return usersDao.insertSelective(users);
    }

    /**
     * 修改用户
     * @param users
     * @return
     */
    @Override
    public int updateUsers(Users users) {
        return usersDao.updateByPrimaryKeySelective(users);
    }

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @Override
    public int delUserById(Integer id) {
        int n = permsService.delUserPerms(id);
        if (n>=0){
            return usersDao.deleteByPrimaryKey(id);
        }
        return -1;
    }
}
