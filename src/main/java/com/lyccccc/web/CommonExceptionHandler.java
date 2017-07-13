package com.lyccccc.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by Liuyuchen on 2017/07/12.
 */
@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String handlerAcceptException(){
        return "errors/error";
    }
}
