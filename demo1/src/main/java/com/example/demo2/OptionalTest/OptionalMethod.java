package com.example.demo2.OptionalTest;

import com.example.demo2.bean.Employee;
import com.example.demo2.bean.User;
import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;
import org.testng.annotations.Test;
import sun.management.counter.Variability;

import javax.swing.text.html.Option;
import javax.xml.bind.SchemaOutputResolver;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * empty() 代表所有null包装起来的Optional
 * isPresent():判断是否为空
 * ifPresent(Consumer consumer):如果不为空，则把数据传到里面consumer的方法中
 * orElse(value)：如果为空，返回方法参数的值
 * orElseGet(Supplier supplier)
 * orElseThrow()
 * map(Function)
 * flatMap()：
 * get()：获取值
 * of:参数必须不为空，否则抛出空指针异常
 * ofNullable：参数可以为空，也可以不为空
 * filter:参数不能为空，否则空指正异常
 * https://blog.csdn.net/B9Q8e64lO6mm/article/details/79029880
 */
public class OptionalMethod {


    @Test
    public void test6(){
        String str = "mazhiyuan";
        // Optional.ofNullable(str).filter();
        String s = Optional.ofNullable(str).filter(u -> Objects.deepEquals("mazhiyuan", str))
                .orElse("haha");
        System.out.println(s);



        /* 繁琐的代码使用Optional重构
        User user = new User();
        user.setName("mazhiyuan");
        if(user != null){
            String name = user.getName();
            if("mazhiyuan".equals(name)){
                System.out.println(name);
            }
        }else{
            User user2 = new User();
            user2.setName("mazhih");
            String name = user2.getName();
            System.out.println(name);
        }*/
        /*User user = new User();
        user.setName("mazhiyuan");
        Optional.ofNullable(user).ifPresent("mazhiyuan".equals(user.getName()));*/
    }

    @Test
    public void test5(){
        Employee employee1 = new Employee(1,"mazhiyuan",12,'男',3500);
        Employee employee2 = new Employee(2,"mazhiyuan",10,'男',13546);
        Employee employee3 = new Employee(3,"mazhiyuan",9,'男',2344);
        Employee employee4 = new Employee(4,"mazhiyuan",18,'男',7434);
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        Optional<List<Employee>> list1 = Optional.ofNullable(list);
        Optional<Integer> integer = list1.map(new Function<List<Employee>, Integer>() {
            @Override
            public Integer apply(List<Employee> employees) {
                return employees.size();
            }
        });
        Optional<Integer> integer1 = list1.map(employees -> employees.size());

        System.out.println(integer1.get());

    }

    @Test
    public void test4(){
        Optional<String> optional = Optional.ofNullable("abc");
        String str = optional.orElse("jdfsgbj");
        String s = optional.orElseGet(new Supplier<String>() {
            @Override
            public String get() {
                return "bjfdj";
            }


        });
        optional.orElseGet(()->"jfdsgg");
        System.out.println("nknj");
        System.out.println(str);
    }


    @Test
    public void test3(){
        Optional<String> optional = Optional.ofNullable("abc");
        boolean present = optional.isPresent();
        System.out.println(present);
        optional.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        });


        //若不为空就返回原理的值，若为空就操作返回方法返回值
        optional.orElseGet(new Supplier<String>() {
            @Override
            public String get() {
                return null;
            }
        });
        //若不为空就返回原来只，若为空就返回参数值
        String ma = optional.orElse("ma");
        //若不为空，就操作
        optional.ifPresent(s->System.out.println(s));
        optional.ifPresent(System.out::print);

    }

    @Test
    public void test2(){
        Optional<String> optional = Optional.ofNullable(null);

        /*optional.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>3;
            }
        });*/
        Optional<String> s1 = optional.filter(s -> s.length() > 2);
        System.out.println(s1.get());

    }

    @Test
    public void test1(){
        Optional<String> optional = Optional.ofNullable("nfdksnjf");
        System.out.println(optional.get());
    }
}
