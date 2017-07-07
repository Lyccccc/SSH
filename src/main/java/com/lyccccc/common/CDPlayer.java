package com.lyccccc.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Lenovo on 2017/07/05.
 */
@Component
public class CDPlayer implements MediaPlayer {


    private CompactDisc compactDisc;

    @Autowired
    public void setCd(@Qualifier("blankDisc")CompactDisc cd) {
        this.compactDisc = cd;
    }

    public void play() {
        System.out.println("CD player!");
        compactDisc.play();
        System.out.println(compactDisc);
    }
}
