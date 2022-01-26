package com.wry.service;

import com.wry.pojo.Users;

import java.util.List;

public interface IUsersService {
    //查询所有用户
    List<Users> findUsers(String name);

    //添加用户
    int saveUsers(Users users);

    //修改用户
    int updateUsers(Users users);

    //根据id删除用户
    int delUserById(Integer id);
}
