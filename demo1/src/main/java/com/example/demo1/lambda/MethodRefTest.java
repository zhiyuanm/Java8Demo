package com.example.demo1.lambda;

import com.example.demo1.bean.Employee;
import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.nashorn.internal.ir.FunctionCall;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * * 一、理解
 * 方法引用 可以看作是Lambda表达式的一种简化形式，也是可以作为函数式接口的实例出现的
 *
 * 能用方法引用的地方肯定能用Lambda表达式
 * 但能用Lambda表达式的地方不一定能用方法引用，必须满足第二点的要求
 *
 *
 *二、要求
 *1、Lambda体中仅仅只有一句话
 *2、仅有的一句话为调用方法
 *3、调用的方法的参数列表和抽象方法的参数列表一致，并且调用方法的返回类型和抽象方法的返回类型一致
 *或
 *	抽象方法的第一个参数和调用方法的调用者一致，其他参数也一致。并且调用方法的返回类型和抽象方法的返回类型一致
 *三、语法
 *类名或对象名::方法名
 *情况：
 *1、对象名::普通方法
 *2、类名::静态方法
 *3、类名::普通方法
 *
 *
 * 这里说的抽象方法是函数式接口中的抽象方法
 *  这里说的调用方法是实现接口中的抽象方法，在抽象方法中有调用另外的方法是调用方法
 *
 *  使用方法引用回事Lambda表达式更加的简单
 *
 *  抽象方法的第一个参数是调用方法的调用者，且其他参数与调用方法参数一致，返回值也一致，
 *  这种情况属于   类名::普通方法
 *
 */
public class MethodRefTest {


    //对象调普通方法
    @Test
    public void test1(){

        Consumer<String> consumer = System.out::println;
        consumer.accept("fsdkngjksfnj");
    }
    //类名调用静态方法
    @Test
    public void test2(){
        //
        Comparator<Double> comparator = (Double d1,Double d2)->Double.compare(d1,d2);
        //
        Comparator<Double> comparator1 = Double::compare;
    }

    // 类名普通方法
    // 根据传入的Employee对象返回名称
    @Test
    public void test3(){
        Function<Employee,String> fun = new Function<Employee, String>() {
            @Override
            public String apply(Employee employee) {

                //属于抽象方法是调用方法的调用者
                return employee.getName();
            }
        };
        // Lambda+函数引用
        Function<Employee ,String> fun2 = Employee::getName;
        System.out.println(fun2.apply(new Employee(1,"s",1,'男',1200)));

    }

    @Test
    public void test4(){
//        BiFunction<String,String,Boolean> bifun = new BiFunction<String, String, Boolean>() {
//            @Override
//            public Boolean apply(String s, String s2) {
//                return s.contains(s2);
//            }
//        };
//        bifun.apply("mazhiyuan","mazhi");

        BiFunction<String,String,Boolean> binfun2 = String::contains;
        System.out.println(binfun2.apply("mazhiyuan","mazhi"));

        BiFunction<List<String>,String ,Boolean> bifun3 = List::contains;
        System.out.print(bifun3.apply(Arrays.asList("a","b","c","d"),"g"));
    }

}
