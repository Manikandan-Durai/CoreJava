package com.te.Day_6.RepeatFront;

import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a String");
		String str=scan.nextLine();
		System.out.println("Enter count to repeat");
		int count=scan.nextInt();
		str=UserMain.repeatFirstThreeCharacters(str, count);
		System.out.println(str);
	}
}
