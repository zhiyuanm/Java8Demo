package com.example.demo1.stream;

import com.example.demo1.bean.Employee;
import com.example.demo1.bean.EmployeeData;
import org.testng.annotations.Test;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
/**
 *
 * 此类用于演示StreamAPI的使用步骤：中间操作
 * @author liyuting
 * 常见方法：
 * filter(Predicate pre):根据条件过滤
 * limit(long maxSize):截断前maxSize个元素  ,新的stream的个数<=maxSize
 * skip(long s):去掉前s个，返回新stream
 * distinct():去重，根据hashCode和equals方法实现去重
 *
 * map(Function fun):映射
 * sorted():自然排序，要求元素本身实现Comparable接口
 * sorted(Comparator)：定制排序
 * 特点：
 *
 * 1、Stream是一次性消费的，用完一次，不能再执行其他的中间操作
 * 2、每次调用中间操作，都会生成一个新的Stream对象，可以继续再进行其他处理，形成“流水线”操作
 * 3、中间操作必须等待终止操作执行后，才会做处理，也就是“惰性求值”或“延迟操作”
 *
 */
public class MidOptTest {

    @Test
    public void test2(){
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Employee> stream = employees.stream();
        //获取姓名大于2的员工姓名
        //stream.map(Employee::getName).filter(t->t.length()>2).distinct().forEach(e-> System.out.println(e));
        stream.sorted((o1,o2)->Double.compare(o1.getSalary(),o2.getSalary())).forEach(e-> System.out.println(e));
    }


    @Test
    public void test1(){

        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Employee> stream = employees.stream();


        //Stream<Employee> employeeStream = stream.filter(e -> e.getSalary() > 30000);
       // employeeStream.forEach(e-> System.out.println(e));


//        Stream<Employee> limit = stream.limit(3);
//        limit.forEach(e-> System.out.println(e));


        Stream<Employee> skip = stream.skip(3);
        skip.forEach(e-> System.out.println(e));



    }


}
