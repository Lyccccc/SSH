package com.lyccccc.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by Lenovo on 2017/07/06.
 */
@Aspect
public class Audience {
    @Pointcut("execution(* com.lyccccc.aop.Perform.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void keepSilent(){
        System.out.println("keepSilent...");
    }

    @After("performance()")
    public void applaud(){
        System.out.println("applauding...");
    }
}
