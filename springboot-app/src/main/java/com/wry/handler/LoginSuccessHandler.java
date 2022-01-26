package com.wry.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wry.utils.JwtTokenUtils;
import com.wry.utils.ResponseResult;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 登录成功后的处理
 */
public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse,
                                        Authentication authentication) throws IOException, ServletException {
        //获取登录成功后的对象
        User user = (User) authentication.getPrincipal();

        //设置json编码
        httpServletResponse.setContentType("application/json;charset=UTF-8");

        //将ResponseResult转为json
        ObjectMapper mapper = new ObjectMapper();

        Map<String,Object> msg = new HashMap<>();
        msg.put("users", user);
        //输出到页面
        PrintWriter out = httpServletResponse.getWriter();
        try {
            //生成token
            String token = JwtTokenUtils.createJwtToken(user.getUsername());
            //使用统一消息返回类封装数据并把token返回
            msg.put("token", token);
            out.write(mapper.writeValueAsString(new ResponseResult<Object>(200,"登录成功",msg)));
        } catch (Exception e) {
            out.write(mapper.writeValueAsString(new ResponseResult<Object>(6001,"token异常")));
        }finally {
            //关流
            out.close();
        }

    }
}
