package com.lyccccc.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Lenovo on 2017/07/05.
 */
@Component("blankDisc")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BlankDisc implements CompactDisc {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void play() {
        System.out.println("Hey this is blankDisc!");
    }
}
