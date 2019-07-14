package com.example.demo2.stream;

import com.example.demo2.bean.Employee;
import com.example.demo2.bean.EmployeeData;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 此类用于演示StreamAPI的使用步骤：终止操作
 * @author liyuting
 *
 * 常见方法：
 * count:统计流中的元素个数
 * max:根据比较器的比较规则获取流中的最大值
 * min:根据比较器的比较规则获取流中的最小值
 * forEach：内部迭代
 *
 * allMatch:检测是否全部匹配某条件
 * anyMatch:检测是否至少有一个匹配该条件
 * noneMatch:检测是否全部不匹配
 * findFirst:获取流中的第一个元素
 * findAny:获取流中的任意一个元素
 *
 *
 * reduce:归约，一般和map搭配使用
 */
public class EndOptTest {
    //姓啊的名字拼接

    @Test
    public void test2(){
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Employee> stream = employees.stream();
        Optional<String> opt = stream.filter(e -> e.getName().startsWith("阿")).map(Employee::getName).reduce((s, t) -> s +","+ t);
        System.out.println(opt);
    }

}
