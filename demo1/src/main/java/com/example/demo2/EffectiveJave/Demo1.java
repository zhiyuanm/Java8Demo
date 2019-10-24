package com.example.demo2.EffectiveJave;

import org.testng.annotations.Test;

public class Demo1 {

    @Test
    public void test1(){
        /**
         *   a. 当 String 的参数值在不区分大小写的时候等于 "true" ，则 Boolean.valueOf(String) 返回值为 true；
         b. 否则返回值为 false ，参数为空时也返回 false 。.
         */
        boolean a = Boolean.valueOf("true");
        boolean b = Boolean.valueOf("TRUE");
        boolean c = Boolean.valueOf("tRUE");
        boolean d = Boolean.valueOf("abc");
        boolean e = Boolean.valueOf("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
