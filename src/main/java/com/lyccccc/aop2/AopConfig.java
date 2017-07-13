package com.lyccccc.aop2;

import org.springframework.context.annotation.*;

/**
 * Created by Lenovo on 2017/07/06.
 */
//@Configuration
//@EnableAspectJAutoProxy
//@ComponentScan
//@ImportResource("classpath:spring/aop.xml")
public class AopConfig {
//    @Bean
    public Audience audience(){
        return new Audience();
    }
}
