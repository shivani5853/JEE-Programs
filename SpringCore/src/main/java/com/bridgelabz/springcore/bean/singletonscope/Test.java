package com.bridgelabz.springcore.bean.singletonscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.springcore.utility.Utility;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Login login=(Login) context.getBean("Login");
		System.out.println("Enter the UserName");
		String username=Utility.inputString();
		System.out.println("Enter the Password");
		String password=Utility.inputString();
		login.setUserName(username);
		login.setPassword(password);
		
		System.out.println("username:"+login.getUserName());
		System.out.println("Password:"+login.getPassword());
	
		
	}
}
