package com.te.Day5.FindElementPosistionInReverseStringArray;

import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the Szie of an array ");
		int size=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Elements of an Array ");
		String [] str=new String [size];
		for (int i = 0; i < str.length; i++) 
		{
			str[i]=scan.nextLine();
		}
		System.out.println("Enter a String to find position ");
		String input=scan.next();
		int value=UserMain.getElementPosition(str, input);
		System.out.println(value);
	}
}
