package com.bridgelabz.springcore.dependancyinjection.hardcodeddependancy;

public class Test {
	public static void main(String[] args) {
		Application application=new Application();
		application.processEmail("Hi shivani","Shivani@Gmail.com");
	}
}
