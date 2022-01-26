package com.wry.controller;

import com.wry.pojo.Perms;
import com.wry.service.IPermsService;
import com.wry.utils.JwtTokenUtils;
import com.wry.utils.ResponseResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 权限控制器类
 */
@RestController
public class PermsController {
    @Resource
    private IPermsService permsService;

    /**
     * 加载当前登录用户的菜单列表
     * @param request
     * @return
     */
    @GetMapping("perms/menu")
    public ResponseResult<Object> getMenu(HttpServletRequest request){
        //获取token
        String Token = request.getHeader("Token");
        //根据token获得用户名
        String username = JwtTokenUtils.getUserNameFormJwt(Token);
        List<Perms> permsList = permsService.findUserMenuByName(username);
        if (permsList != null && permsList.size()>0){
            return new ResponseResult<>(200, "Ok",permsList);
        }else {
            return new ResponseResult<>(4001, "您还未被授权,什么也没有~");
        }
    }

    /**
     * 加载当前用户所拥有的权限
     * @param userid
     * @return
     */
    @GetMapping("perms/showPerms")
    @PreAuthorize("hasAuthority('right:update')")
    public ResponseResult<Object> showPerms(@RequestParam("userid") Integer userid){
        //获得所有的权限信息 组合成权限树
        List<Perms> permsList = permsService.findPerms();
        //根据用户id获得对应的权限id集合
        List<Integer> userPermsList = permsService.getUserPerms(userid);

        Map<String,Object> map = new HashMap<>();
        map.put("permsList",permsList);
        map.put("userPermsList",userPermsList);

        if (permsList.size() > 0 && permsList != null){
            return new ResponseResult<>(200, "加载权限树ok",map);
        }else {
            return new ResponseResult<>(4009, "权限加载失败");
        }
    }

    /**
     * 修改用户权限
     * @param key
     * @param userid
     * @return
     */
    @GetMapping("perms/update")
    public ResponseResult<Object> updatePerms(@RequestParam("key") String key,
                                              @RequestParam("userid") Integer userid){
        //切割字符串转为数组
        String[] perms= key.split(",");
        //数组转集合
        List<String> permsIds = Arrays.asList(perms);
        //1.删除当前用户的所有权限
        //2.添加权限
        int n = permsService.saveUserPerms(permsIds, userid);
        if (n > 0){
            return new ResponseResult<>(200, "修改用户权限成功");
        }else {
            return new ResponseResult<>(4010, "修改用户权限失败");
        }
    }
}
