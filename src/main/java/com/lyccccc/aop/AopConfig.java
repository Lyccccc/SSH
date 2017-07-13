package com.lyccccc.aop;

import org.springframework.context.annotation.*;

/**
 * Created by Lenovo on 2017/07/06.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AopConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }
}
