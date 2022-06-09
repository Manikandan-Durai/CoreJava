package com.te.customer.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args) 
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("custom.xml");
		MemberShip ms= (MemberShip)context.getBean("membership");
		ms.display();
		Customer c= (Customer)context.getBean("customer");
		c.display();
	}
}
