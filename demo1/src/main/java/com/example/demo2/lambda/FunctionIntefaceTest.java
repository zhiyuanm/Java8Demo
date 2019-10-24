package com.example.demo2.lambda;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.glassfish.external.statistics.CountStatistic;
import org.testng.annotations.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 函数式接口
 */
public class FunctionIntefaceTest {


    @Test
    public void test(){

//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//
//            }
//        };

        Consumer<String> consumer1 = (s)-> System.out.print(s);
        consumer1.accept("kfdnjndfjnsss");

        Consumer<String> consumer = (s)->{
          if(s.equals("a")){
              System.out.println("a");
          }else{
              System.out.println("b");
          }
        };

    }


    @Test
    public void test2(){

        Supplier<String> supplier = ()->"nfjsnjg";
        String s = supplier.get();
        System.out.println(s);
    }

    @Test
    public void test3(){

        Function<String,Integer> function = (s)->s.length();
        System.out.println(function.apply("abc"));
    }

    /**
     * 定义一个方法，传入一个字符串，并把字符串转化成大写，返回去
     *
     */
    public String method1(Function<String,String> fun,String name){
        return fun.apply(name);
    }

    @Test
    public void test31(){
        String mazhiyuan = method1(s -> s.toUpperCase(), "mazhiyuan");
        System.out.println(mazhiyuan);
    }

    @Test
    public void test4(){
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };

        Predicate<String> predicate1 = s->s.length()==1;
        System.out.println(predicate1.test("a"));
    }

}
