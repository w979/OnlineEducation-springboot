package com.wry.exception;

import com.wry.utils.ResponseResult;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpServerErrorException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 全局异常处理类
 */
@ControllerAdvice  //controller增强
public class GlobalException {

    /**
     * 400 - Bad Request
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public ResponseResult<Void> handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        return new ResponseResult<>(400,"参数解析失败");
    }

    /**
     * 405 - Method Not Allowed
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseBody
    public ResponseResult<Void> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        return new ResponseResult<>(405,"不支持当前请求的方法");
    }

    /**
     * 415 - Unsupported Media Type
     */
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    @ResponseBody
    public ResponseResult<Void> handleHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e) {
        return new ResponseResult<>(415,"不支持当前媒体类型");
    }

    /**
     * 500 - Internal Server Error
     */
    @ExceptionHandler(HttpServerErrorException.class)
    @ResponseBody
    public ResponseResult<Void> handleServerErrorException(HttpServerErrorException e) {
        return new ResponseResult<>(500,"服务器异常");
    }

    /**
     * 5001
     * @param e
     * @return
     */
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public ResponseResult<Void> handleArithmeticException(ArithmeticException e){
        return new ResponseResult<>(5001,"除数不能为0");
    }

    /**
     * 表单验证异常
     */
    @ExceptionHandler(ValidatorException.class)
    @ResponseBody
    public ResponseResult<Object> handleValidatorException(ValidatorException e) {
        //取出BindingResult中的异常信息并保存到错误对象中返回给页面
        Map<String,String> beanError=new HashMap<String,String>();
        List<FieldError> list = e.getResult().getFieldErrors();
        for (FieldError error : list) {
            beanError.put(error.getField(),error.getDefaultMessage());
        }
        //将错误对象发送到页面
        return new ResponseResult<>(456,"存在表单不合法",beanError);
    }
}
