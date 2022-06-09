package com.te.day_10.ageforvoting;

import java.text.ParseException;
import java.util.Scanner;

public class Main 
{
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) throws ParseException
	{
		System.out.println("Enter a date");
		String date1=scan.next();
		System.out.println("Enter a date to compare");
		String date2=scan.next();
		String result=UserMain.getAge(date1, date2);
		System.out.println(result);
	}
}
