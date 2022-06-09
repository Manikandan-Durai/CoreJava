package com.te.day_10.leapyear;

import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)  
	{
		System.out.println("Enter a date");
		String date=scan.nextLine();
		boolean result=UserMain.isLeapYear(date);
		System.out.println(result);
	}
}
