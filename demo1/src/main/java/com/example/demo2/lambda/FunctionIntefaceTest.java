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
        /**
         * 消费型接口，有入参，没有返回值
         */
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
        /**
         * 供给型接口 没有入参，只有返回值
         */
        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return null;
            }
        };
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
    Function<String,String> x = new Function<String, String>() {
        @Override
        public String apply(String s) {
            return null;
        }
    };
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

    /**
     * 定义一个方法,传入一个字符串，并把字符串的大写返回
     */
    public String meth(Function<String,String> function,String string) {
        return function.apply(string);
    }
    @Test
    public void test5(){

    }
}
