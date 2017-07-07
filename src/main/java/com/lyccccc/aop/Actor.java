package com.lyccccc.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Lenovo on 2017/07/06.
 */
@Component
public class Actor implements Perform {
    public void perform() {
        System.out.println("performing!");
    }
}
