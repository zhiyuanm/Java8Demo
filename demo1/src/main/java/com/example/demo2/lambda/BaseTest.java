package com.example.demo2.lambda;


import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Stream;

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
 *理解：对象的构造器中指定传递指定类型接口，所以lambda表达式的接口名不写
 *      由于接口中只有一个方法，所以方法名也不写
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

    @Test
    public void test3(){
        Thread thread = new Thread(()->System.out.print("gfdhnj"));
        thread.start();
    }

    @Test
    public void test4(){

        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        TreeSet<String> treeSet2 = new TreeSet<>((o1,o2)->{
            return o1.compareTo(o2);
        });
        treeSet2.add("h");
        treeSet2.add("l");
        treeSet2.add("a");
        treeSet2.add("c");


    }

}
