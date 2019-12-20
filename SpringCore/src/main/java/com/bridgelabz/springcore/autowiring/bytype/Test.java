package com.bridgelabz.springcore.autowiring.bytype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Spring.xml");
		address add=ctx.getBean("address",address.class);
		System.out.println(address.class+" "+add.getPerson().getUserName());
		System.out.println(address.class+" "+add.getPerson().getPassword());
	}
}
