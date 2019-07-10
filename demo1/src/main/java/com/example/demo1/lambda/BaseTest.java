package com.example.demo1.lambda;

import org.testng.annotations.Test;
/**
 *  @author    zhiyuan.ma
 *  @date      2019/7/10 23:17
 *  @email     mzy157@sina.com
 *  @version   1.0
 *  @Description 此类主要用于演示Lambda的使用
 *  此处对Lambda表达式在做一些说明
 * 实际上，Lambda表达式是匿名内部类的一种简化或代替
 * 能用Lambda表达式的地方，肯定能用匿名内部类！
 * 但能用匿名内部类的地方，不一定能用Lambda表达式，除非满足以下条件：
 * 		该接口或抽象类中只有一个抽象方法
 *
 * 1.入参类型可省略
 * 2.当有一个入参是，小括号可省略
 * 3.当方法体中只有一句话是，大括号可省略，若有一个return语句，return也可以省略
 *
 *
 *
 *
 */
public class BaseTest {


    @Test
    public void test1(){

        Runnable runnable = ()->{
            System.out.println("nkfsdnjkg");
        };
        runnable.run();
        Runnable runnable1 = ()-> System.out.println("fds");
        runnable1.run();
    }


    @Test
    public void test2(){

        Thread thread  = new Thread(()->{
            System.out.println("sgjsfjgf");
        });
        thread.start();
        System.out.println("-------------");
        Thread thread1 = new Thread(()-> System.out.println("马志远"));
        thread1.start();
    }

}
