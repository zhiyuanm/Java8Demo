package com.example.demo2.exec;

import com.example.demo2.bean.Employee;
import com.example.demo2.bean.EmployeeData;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据不同的员工信息条件过来员工数据
 */
public class Demo1 {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
//        List<Employee> employees1 = EmployeesFilter(employees, new Filter() {
//            @Override
//            public Boolean EmpFilter(Employee employee) {
//                return null;
//            }
//        });
        List<Employee> employees1 = EmployeesFilter(employees, e -> e.getAge() > 25);

        for (Employee employee : employees1) {
            System.out.println(employee);
        }
    }

    public static List<Employee> EmployeesFilter(List<Employee> employees, Filter filter){
        List<Employee> list = new ArrayList<>();
        for (Employee employee : employees) {
            if(filter.EmpFilter(employee)){
                list.add(employee);
            }
        }
        return list;
    }
}
interface Filter{
        Boolean EmpFilter(Employee employee);
}
