package com.bridgelabz.springcore.bean.prototypescope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.springcore.utility.Utility;

public class Test {
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Registration registration=(Registration) context.getBean("Registration");
	
	System.out.println("First Name");
	String firstName=Utility.inputString();
	System.out.println("LastName:");
	String lastName=Utility.inputString();
	System.out.println("UserName:");
	String username=Utility.inputString();
	System.out.println("Email:");
	String Email=Utility.inputString();
	System.out.println("Phone Number:");
	String PhoneNumber=Utility.inputString();
	
	registration.setFirstName(firstName);
	registration.setEmail(Email);
	registration.setLastName(lastName);
	registration.setUserName(username);
	registration.setPhoneNumber(PhoneNumber);
	
	System.out.println(registration.getFirstName()+" "+registration.getLastName()+" "+registration.getEmail()+" "+registration.getUserName()+" "+registration.getPhoneNumber());
	}
}
