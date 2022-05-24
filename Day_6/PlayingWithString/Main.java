package com.te.Day_6.PlayingWithString;

import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the size of an Array");
		int size=scan.nextInt();
		String [] str=new String[size];
		scan.nextLine();
		System.out.println("Enter the Elments of Array ");
		for (int i = 0; i < str.length; i++) {
			str[i]=scan.nextLine();
		}
		System.out.println("Enter the a number to get character ");
		int n=scan.nextInt();
		String str1=UserMain.formString(str,n);
		System.out.println(str1);
	}
}
