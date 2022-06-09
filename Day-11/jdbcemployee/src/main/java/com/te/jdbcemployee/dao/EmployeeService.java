package com.te.jdbcemployee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.te.jdbcemployee.bean.Employee;

public class EmployeeService 
{
	public boolean addEmployee(Employee employee)
	{
		boolean result=false;
		Connection con=EmployeeDao.getConnection();
		String insert="insert into employee(name,date_of_birth,salary) values (?,?,?)";
		try {
			PreparedStatement ps= con.prepareStatement(insert);
			ps.setString(1, employee.getName());
			ps.setDate(2,java.sql.Date.valueOf(employee.getDateOfBirth()));
			ps.setInt(3, employee.getSalary());
			int row=ps.executeUpdate();
			if(row>0)
				return result=true;
			else
				return result=false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
