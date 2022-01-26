package com.wry.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wry.pojo.Users;
import com.wry.service.IUsersService;
import com.wry.utils.ResponseResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UsersController {
    @Resource
    private IUsersService usersService;

    /**
     * 用户列表+条件查询
     * @param pageNum
     * @param pageSize
     * @param name
     * @return
     */
    @GetMapping("/user/list")
    public ResponseResult<Object> queryUsers(@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                                               @RequestParam(value = "pageSize",required = false,defaultValue = "5")Integer pageSize,
                                               @RequestParam(value = "name",required = false,defaultValue = "") String name){
        PageHelper.startPage(pageNum, pageSize);
        List<Users> usersList = usersService.findUsers(name);
        PageInfo<Users> pageInfo = new PageInfo<>(usersList);
        if (usersList.size()>0){
            return  new ResponseResult<>(200,"OK",pageInfo);
        }else {
            return  new ResponseResult<>(4002,"没有查询到相关数据哦~");
        }
    }

    /**
     * 判断此用户是否有添加用户的权限
     * @return
     */
    @GetMapping("/user/showAdd")
    @PreAuthorize("hasAuthority('user:add')")
    public ResponseResult<Void> showAdd(){
        return  new ResponseResult<>(200,"有添加用户权限ok");
    }


    /**
     * 添加用户
     */
    @PostMapping("/user/add")
    public ResponseResult<Object> saveUser(@RequestBody Users users){
        //用户密码加密
        String pwd =new BCryptPasswordEncoder().encode(users.getPassword());
        users.setPassword(pwd);
        int n = usersService.saveUsers(users);
        if (n>0){
            return  new ResponseResult<>(200,"添加用户成功");
        }else {
            return  new ResponseResult<>(4004,"添加用户失败");
        }
    }

    /**
     * 判断此用户是否有修改用户权限
     * @return
     */
    @GetMapping("/user/showUpdate")
    @PreAuthorize("hasAuthority('user:update')")
    public ResponseResult<Void> showUpdate(){
        return  new ResponseResult<>(200,"有修改用户权限ok");
    }

    /**
     * 修改用户
     */
    @PostMapping("/user/update")
    public ResponseResult<Object> updateUser(@RequestBody Users users){
        //判断密码是否更改过
        if (!(users.getPassword().equals(users.getRpassword()))){
            //更改过则加密密码
            users.setPassword(new BCryptPasswordEncoder().encode(users.getPassword()));
        }

        int n = usersService.updateUsers(users);
        if (n>0){
            return  new ResponseResult<>(200,"修改用户成功");
        }else {
            return  new ResponseResult<>(4005,"修改用户失败");
        }
    }

    /**
     * 删除用户
     */
    @GetMapping("/user/delete")
    @PreAuthorize("hasAuthority('user:delete')")
    public ResponseResult<Void> deleteUser(@RequestParam("id") Integer id){
        //1.删除用户的权限
        //2.删除用户表的用户
        int n = usersService.delUserById(id);
        if (n>0){
            return  new ResponseResult<>(200,"删除用户成功");
        }else {
            return  new ResponseResult<>(4006,"删除用户失败,请重试");
        }
    }
}
