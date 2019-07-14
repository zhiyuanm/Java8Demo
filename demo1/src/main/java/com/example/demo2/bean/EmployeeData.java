package com.example.demo2.bean;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
	//功能：获取一个保存多个员工的集合对象
	public static List<Employee> getEmployees(){
		List<Employee >  list = new ArrayList<>();
		list.add(new Employee(1,"段誉",29,'男',20000));
		list.add(new Employee(2,"乔峰",39,'男',80000));
		list.add(new Employee(3,"虚竹",29,'男',30000));
		list.add(new Employee(4,"王语嫣",19,'女',29000));
		list.add(new Employee(5,"阿朱",18,'女',25000));
		list.add(new Employee(6,"阿紫",17,'女',12000));
		list.add(new Employee(7,"阿碧",20,'女',10000));
		list.add(new Employee(4,"王语嫣",19,'女',29000));
		list.add(new Employee(5,"阿朱",18,'女',25000));
		list.add(new Employee(4,"王语嫣",19,'女',29000));
		return list;
		
	}

}
