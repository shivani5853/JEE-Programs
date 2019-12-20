package com.bridgelabz.springcore.dependancyinjection.constructor;

public class Employee {
	private int Id;
	private String address;

	public Employee() {
		System.out.println("Default Constructor!!!");
	}

	public Employee(int Id) {
		this.Id = Id;
	}

	public Employee(String address) {
		this.address = address;
	}

	public Employee(int Id, String address) {
		this.Id = Id;
		this.address = address;
	}

	public void show() {
		System.out.println(Id + " " + address);
	}
}
