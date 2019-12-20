package com.bridgelabz.springcore.dependancyinjection.constructorInheritance;

public class Employee {

	private String name;
	private String email;
	private Address address;

	public Employee(String name, String email, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public Employee() {

	}
	void show(){  
	    System.out.println(name+" "+name);  
	}  
}
