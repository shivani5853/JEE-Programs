package com.bridgelabz.springcore.autowiring.byname;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Spring.xml");
		EmployeeService service=ctx.getBean("EmployeebyName", EmployeeService.class);
		System.out.println(EmployeeService.class+" "+service.getEmployee().getId());
	}
}
