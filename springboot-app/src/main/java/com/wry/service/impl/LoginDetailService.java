package com.wry.service.impl;

import com.wry.dao.UsersDao;
import com.wry.pojo.Users;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 登录认证业务类
 */
@Service
public class LoginDetailService implements UserDetailsService {
    @Resource
    private UsersDao usersDao;

    /**
     *
     * @param username 获得用户在登录页面输入的帐号
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //通过账号查询用户
        Users users = usersDao.getLogin(username);
        //取出用户的权限
        List<String> permsList = users.getPermsList();
        //将集合转为字符串，并以逗号隔开
        String authority = String.join(",", permsList);
        //判断账号是否被锁定
        if (users != null &&users.getStatus().equals("n")){
            //将实体类Users对象转为Spring Security的User对象
            return new User(users.getUsername(),users.getPassword(),true,false,false,false,
                    AuthorityUtils.commaSeparatedStringToAuthorityList(authority));
        }

        //将实体类Users对象转为Spring Security的User对象
        return new User(users.getUsername(),users.getPassword(),
                AuthorityUtils.commaSeparatedStringToAuthorityList(authority));

    }
}
