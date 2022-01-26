package com.wry.exception;

import org.springframework.validation.BindingResult;

/**
 * Validator自定义异常类
 */
public class ValidatorException extends  Exception{
    //保存异常信息
    private BindingResult result;
    public BindingResult getResult() {
        return result;
    }

    public ValidatorException(BindingResult result) {
        this.result = result;
    }
}