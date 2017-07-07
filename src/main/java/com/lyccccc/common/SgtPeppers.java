package com.lyccccc.common;

import org.springframework.stereotype.Component;

/**
 * Created by Lenovo on 2017/07/05.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "This is SgtPeppers!";

    public void play(){
        System.out.println(title);
    }
}
