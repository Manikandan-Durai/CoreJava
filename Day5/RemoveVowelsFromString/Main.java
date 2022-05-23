package com.te.Day5.RemoveVowelsFromString;

import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a String");
		String str=scan.nextLine();
		str=UserMain.removeEvenVowels(str);
		System.out.println("The String after removing vowels "+str);
	}
}
