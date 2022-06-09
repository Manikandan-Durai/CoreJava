package com.te.jdbcemployee.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class EmployeeDao 
{
	private static Connection con=null;
	private static Properties properties= new Properties();
	public static Connection getConnection()
	{
		try {
			FileInputStream fis= new FileInputStream("database.properties");
			properties.load(fis);
			con=DriverManager.getConnection(properties.getProperty("DB_URL"),properties.getProperty("DB_USERNAME"),properties.getProperty("DB_PASSWORD"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
}
