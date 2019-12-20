package com.bridgelabz.springcore.dependancyinjection.dependanyinjection;

public class Test {
	public static void main(String[] args) {
		EmailServer emailServer=new EmailServer();
		Application application=new Application(emailServer);
		application.processEmail("Hi shivani","Shivani@Gmail.com");
	}
}
