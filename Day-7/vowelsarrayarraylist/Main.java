package com.te.vowelsarrayarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array ");
		int size=scan.nextInt();
		String [] str= new String[size];
		for (int i = 0; i < str.length; i++) {
			str[i]=scan.next();
		}
		List<String> list= new ArrayList();
		list=UserMain.matchCharacter(str);
		for (String string : list) {
			System.out.println(string);
		}
	}
}

