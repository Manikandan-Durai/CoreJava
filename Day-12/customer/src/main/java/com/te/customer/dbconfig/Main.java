package com.te.customer.dbconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("dbconfig.xml");
		DBConfig db=(DBConfig)context.getBean("dbconfig");
		db.display();
	}
}
