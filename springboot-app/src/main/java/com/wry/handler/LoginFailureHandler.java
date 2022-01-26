package com.wry.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wry.utils.ResponseResult;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 登录失败后处理
 */
public class LoginFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse,
                                        AuthenticationException e) throws IOException, ServletException {
        //设置json编码
        httpServletResponse.setContentType("application/json;charset=UTF-8");

        //将ResponseResult转为json
        ObjectMapper mapper = new ObjectMapper();
        //JackSon中将对象序列化为json字符串
        String msg = "";

    //捕获异常并处理
             //账号被禁用异常
        if (e instanceof DisabledException) {
            msg = mapper.writeValueAsString(new ResponseResult<Void>(4003, "账号已被禁用!请联系管理员"));
            //账号被锁定异常
        } else if (e instanceof LockedException) {
            msg = mapper.writeValueAsString(new ResponseResult<Void>(4003, "账号已被锁定!请稍后再试"));
            //账号不存在异常
        } else if (e instanceof InternalAuthenticationServiceException) {
            msg = mapper.writeValueAsString(new ResponseResult<Void>(4001, "账号不存在!"));
            //密码错误异常
        } else if (e instanceof BadCredentialsException) {
            msg = mapper.writeValueAsString(new ResponseResult<Void>(4002, "密码错误!"));
        }

        //输出到页面
        PrintWriter out = httpServletResponse.getWriter();
        out.write(msg);

        //关流
        out.close();
    }
}
