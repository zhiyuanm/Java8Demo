package com.example.demo2.lambda;

import org.testng.annotations.Test;

import java.util.function.Function;

/**
 *
 * 一、理解
 *
 * 构造器引用 本质上也是Lambda表达式，都是作为函数式接口的实例出现的
 *
 * 能用构造器引用的地方，肯定能用Lambda表达式
 * 但能用Lambda表达式的地方，不一定能用构造器引用，必须满足以下要求
 *
 * 二、要求
 *
 * 1、Lambda体中仅仅只有一句话
 * 2、仅有的一句话为调用构造器：  new XX(参数);
 * 3、构造器的参数列表和抽象方法的参数列表一致
 *
 * 三、语法
 * 类名::new
 *
 */
public class ConstructorRefTest {

    @Test
    public void test1(){

//        Function<String,StringBuffer> fun = new Function<String, StringBuffer>() {
//            @Override
//            public StringBuffer apply(String s) {
//                return null;
//            }
//        };

        Function<String,StringBuffer> fun = StringBuffer::new;
        System.out.println(fun.apply("nfksngjknj"));


    }
}
