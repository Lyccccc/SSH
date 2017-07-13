package com.lyccccc.common;

/**
 * Created by Lenovo on 2017/07/07.
 */
public class StaticTest {
    private static int i = 10;
    static{
        i = 20;
    }

    public static void main(String[] args) {
        System.out.println(i);
    }
}
