package com.bridgelabz.springcore.dependancyinjection.constructorInheritance;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resourse=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resourse);
		
		Employee e=(Employee) factory.getBean("constructorInh");
		e.show();
	}
}
