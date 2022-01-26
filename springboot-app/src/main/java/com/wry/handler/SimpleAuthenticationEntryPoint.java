package com.wry.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wry.utils.ResponseResult;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 鉴权过滤器抛出的认证异常
 *   没登录
 */
public class SimpleAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest httpServletRequest,
                         HttpServletResponse httpServletResponse,
                         AuthenticationException e) throws IOException, ServletException {

        //设置响应数据的编码格式
        httpServletResponse.setContentType("application/json;charset=UTF-8");

        //将ResponseResult转为json
        ObjectMapper mapper=new ObjectMapper();
        String json= mapper.writeValueAsString(new ResponseResult<>(4003, "未登录或登录超时,请重新登录.."));//JackSon中将对象序列化为json字符串的方法

        PrintWriter out= httpServletResponse.getWriter();
        out.write(json);
        out.close();

    }
}
