package com.lyccccc.aop2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Lenovo on 2017/07/06.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AopConfig.class)
public class AopTest {
//    @Autowired
    private Perform perform;

//    @Test
    public void aopTest(){
        perform.perform("lalalalala");
    }
}
