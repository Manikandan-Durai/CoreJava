package com.te.Day5.FetchingMiddleCharacterFromString;

import java.util.Scanner;

public class Main 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a String ");
		String str=sc.next();
		String res=UserMain.getMiddleChar(str);
		System.out.println(res);
	}
}
