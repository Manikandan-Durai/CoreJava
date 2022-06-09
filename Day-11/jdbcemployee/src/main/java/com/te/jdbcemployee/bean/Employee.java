package com.te.jdbcemployee.bean;

import java.util.Date;
import java.time.LocalDate;


public class Employee 
{
	private int employeeid;
	private String name;
	private LocalDate dateOfBirth;
	private int salary;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int employeeid, String name, LocalDate dateOfBirth, int salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}
	
}
