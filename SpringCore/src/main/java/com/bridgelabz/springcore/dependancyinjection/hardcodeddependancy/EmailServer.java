package com.bridgelabz.springcore.dependancyinjection.hardcodeddependancy;

public class EmailServer {
	public void sendEmail(String message,String receive)
	{
		System.out.println("Email is Received "+receive+" the message is "+message);
	}
}
