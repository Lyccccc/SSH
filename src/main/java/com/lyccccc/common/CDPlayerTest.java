package com.lyccccc.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Lenovo on 2017/07/05.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class CDPlayerTest {

    @Autowired
    private MediaPlayer mediaPlayer;

    @Autowired
    @Qualifier("blankDisc")
    private CompactDisc compactDisc;

//    public void setCompactDisc(@Qualifier("blankDisc")CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }

    @Test
    public void play(){
        mediaPlayer.play();
        compactDisc.play();
        System.out.println(compactDisc);
    }
}
