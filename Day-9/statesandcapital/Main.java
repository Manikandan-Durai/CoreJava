package com.te.day_9.statesandcapital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the no of objects to Store");
		int size=scan.nextInt();
		scan.nextLine();
		Map<String,String> map=new HashMap<String, String>();
		System.out.println("Enter the Map objects");
		for (int i = 0; i < size; i++) 
		{
			map.put(scan.next(), scan.next());
		}
		System.out.println("Enter the input");
		String input=scan.next();
		String str=UserMain.getCapital(map,input);
		System.out.println(str);
	}
}
