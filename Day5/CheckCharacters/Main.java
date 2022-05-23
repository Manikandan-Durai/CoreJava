package com.te.Day5.CheckCharacters;

import java.util.Scanner;

public class Main
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a String ");
		String str=sc.nextLine();
		int res=UserMain.checkCharacters(str);
		if(res==1)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
