package com.lyccccc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by Lenovo on 2017/07/06.
 */
@Aspect
public class Audience {
    @Pointcut("execution(* com.lyccccc.aop.Perform.perform(String)) && args(name)")
    public void performance(String name){}

    @Before("performance(name)")
    public void keepSilent(String name){
        System.out.println("before : " + name);
        System.out.println("keepSilent...");
    }

    @After("performance(name)")
    public void applaud(String name){
        System.out.println("after : " + name);
        System.out.println("applauding...");
    }

//    @Around("performance()")
//    public void watch(ProceedingJoinPoint jp){
//        try{
//            System.out.println("keep silent!");
//            System.out.println("turn off your phone!");
//            jp.proceed();
//            System.out.println("applauding!");
//        }catch (Throwable throwable){
//            System.out.println("demanding  a refund!");
//        }
//
//    }
}
