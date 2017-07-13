package com.lyccccc.aop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Lenovo on 2017/07/06.
 */
public class Audience {
    public void performance(String name){}

    public void keepSilent(String name){
        System.out.println("keepSilent...");
        System.out.println("before :" + name);
    }

    public void applaud(String name){
        System.out.println("applauding...");
        System.out.println("after : " + name);
    }

    public void watchPerformance(ProceedingJoinPoint jp,String name){
        try{
            System.out.println("before : " + name);
            System.out.println("keepSilent!");
            jp.proceed();
            System.out.println("applauding!");
            System.out.println("after : " + name);
        }catch (Throwable t){
            System.out.println("demanding a refund!");
        }
    }

}
