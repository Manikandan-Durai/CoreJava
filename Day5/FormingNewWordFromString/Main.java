package com.te.Day5.FormingNewWordFromString;

import java.util.Scanner;

public class Main
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter a String ");
		String str=sc.nextLine();
		System.out.println("Enter a integer to create a new String ");
		int num=sc.nextInt();
		str=UserMain.formNewWord(str,num);
		System.out.println("The New word is "+str);
	}
}
