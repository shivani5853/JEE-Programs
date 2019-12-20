package com.bridgelabz.springcore.dependancyinjection.constructorInheritance;

public class Address {
	private String State;
	private String City;

	public Address(String state, String city) {
		super();
		State = state;
		City = city;
	}

	public Address() {
	}
}