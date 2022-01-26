package com.wry.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wry.utils.ResponseResult;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 鉴权过滤器抛出的无权限异常
 */
public class SimpleAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse,
                       AccessDeniedException e) throws IOException, ServletException {

        //设置响应数据的编码格式
        httpServletResponse.setContentType("application/json;charset=UTF-8");

        //将ResponseResult转为json
        ObjectMapper mapper=new ObjectMapper();
        String json= mapper.writeValueAsString(new ResponseResult<>(403, "抱歉,您没有权限..."));//JackSon中将对象序列化为json字符串的方法

        PrintWriter out= httpServletResponse.getWriter();
        out.write(json);
        out.close();

    }
}
