package com.te.customer.passport;

public class Employee implements Display
{
	private int empId;
	private String empName;
	private Passport passObj;
	public Employee()
	{
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Passport getPassObj() {
		return passObj;
	}
	public void setPassObj(Passport passObj) {
		this.passObj = passObj;
	}
	public Employee(int empId, String empName, Passport passObj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.passObj = passObj;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", passObj=" + passObj + "]";
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(empId+" "+empName);
	}
	
}
