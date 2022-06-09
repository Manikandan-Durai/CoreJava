package com.te.jdbcemployee.main;


import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import com.te.jdbcemployee.bean.Employee;
import com.te.jdbcemployee.dao.EmployeeService;

public class Main 
{
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args)
	{
	System.out.println("Enter the Employee details");	
//	System.out.println("Enter the employee id");
//	int id=scan.nextInt();
//	System.out.println("Enter the name ");
//	String name=scan.next();
//	System.out.println("Enter the date of birth (yyyy-mm-yy)");
//	LocalDate.parse(scan.next());
//	String date=scan.next();
//	System.out.println("Enter the salary");
//	int sal=scan.nextInt();
	Employee employee = new Employee(scan.nextInt(),scan.next(),LocalDate.parse(scan.next()),scan.nextInt());
	EmployeeService employeeService= new EmployeeService();
	boolean result=employeeService.addEmployee(employee);
	if(result)
		System.out.println("Details inserted");
	else
		System.out.println("Details not Inserted");
	}
}
