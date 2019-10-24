package com.example.demo2.ObjectsDemo;

import com.example.demo2.bean.Employee;
import com.example.demo2.bean.User;
import org.testng.annotations.Test;
import sun.font.TrueTypeFont;

import java.util.Objects;

/**
 * 描述：避免了空指针异常的抛出
 * deepEquals：
 * equals：比较对象的地址是否相等
 */
public class ObjectsTeest {

    @Test
    public void test5(){
        String s = Objects.requireNonNull("");
    }

    @Test
    public void test4(){
        boolean aNull = Objects.isNull("");
        System.out.println(aNull);
        boolean b = Objects.nonNull(null);
        System.out.println(b);
        Object o = Objects.requireNonNull(null,"哈哈哈");

    }

    @Test
    public void test3(){
        Employee employee = new Employee();
        employee.setAge(12);
        employee.setGender('男');
        employee.setName("nfdksng");
        String s = Objects.toString(employee);
        System.out.println(s);
        String s1 = Objects.toString(null);
        System.out.println(s1 instanceof String);
        System.out.println();


    }

    @Test
    public void test2(){
        //计算hashcode值
        int hash = Objects.hash("","","");
        int i = Objects.hashCode("");
    }

    @Test
    public void test1(){
        String str1= "";
        String str2= "";
        System.out.println(Objects.deepEquals(str1,str2));
        boolean equals = Objects.equals(null, "");

        System.out.println(equals);
    }
}
