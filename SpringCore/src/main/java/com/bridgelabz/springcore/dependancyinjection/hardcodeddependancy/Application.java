package com.bridgelabz.springcore.dependancyinjection.hardcodeddependancy;

public class Application {
	private EmailServer email=new EmailServer();
	
	public void processEmail(String mess,String rev)
	{
		this.email.sendEmail(mess, rev);
	}
}
