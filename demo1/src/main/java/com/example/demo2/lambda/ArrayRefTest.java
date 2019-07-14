package com.example.demo2.lambda;


import org.testng.annotations.Test;

import java.util.function.Function;

/**
 * 一、理解
 * 数组引用实质上也是Lambda表达式，可以作为函数式接口的实例出现
 *
 * 能用数组引用的地方肯定能用Lambda表达式
 *
 * 但能用Lambda表达式的地方不一定能用数组引用，必须满足以下要求
 *
 *二、要求 ★
 *	1、Lambda体中仅仅只有一句话
 *	2、仅有的一句话为创建数组对象
 *	3、抽象方法的参数为数组的容量，返回类型为创建的新数组对象
 *
 *三、语法
 *	数组类型[]::new
 */
public class ArrayRefTest {

    @Test
    public void test() {

//        Function<String,String[]> function = new Function<String, String[]>() {
//            @Override
//            public String[] apply(String s) {
//                return new String[0];
//            }
//        };
        Function<Integer, String[]> function = String[]::new;
        String[] apply = function.apply(10);

    }
}
