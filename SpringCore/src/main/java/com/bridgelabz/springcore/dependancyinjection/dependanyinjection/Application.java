package com.bridgelabz.springcore.dependancyinjection.dependanyinjection;

public class Application {
	private EmailServer email=null;
	
	public Application(EmailServer ema)
	{
		this.email=ema;
	}
	
	public void processEmail(String mess,String rev)
	{
		this.email.sendEmail(mess, rev);
	}
}
