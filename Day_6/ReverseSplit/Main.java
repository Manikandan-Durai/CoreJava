package com.te.Day_6.ReverseSplit;

import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter a String ");
		String str=scan.nextLine();
		System.out.println("Enter a character ");
		char s1=scan.next().charAt(0);
		str=UserMain.reShape(str,s1);
		System.out.println("The reshape is "+str);
	}
	
}
