package com.te.customer.passport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("passport.xml");
		Employee emp=(Employee)context.getBean("employee");
		emp.display();
		Passport pass= (Passport)context.getBean("passport");
		pass.display();
	}
}
