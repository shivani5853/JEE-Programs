package com.bridgelabz.springcore.autowiring.byConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	   }
}
