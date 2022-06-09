package com.te.day_10.stringprocessingzigzag;

import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a date");
		String date=scan.next();
		int num=UserMain.getLastDayOfMonth(date);
		System.out.println(num);
	}
}
