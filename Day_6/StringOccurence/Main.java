package com.te.Day_6.StringOccurence;

import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter a String");
		String s1=scan.nextLine();
		System.out.println("Enter a String to Search ");
		String s2=scan.nextLine();
		int count=UserMain.getSubString(s1, s2);
		System.out.println("The count is "+count);
	}
}
