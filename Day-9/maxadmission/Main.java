package com.te.day_9.maxadmission;

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
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		System.out.println("Enter the Map objects");
		for (int i = 0; i < size; i++) 
		{
			map.put(scan.nextInt(), scan.nextInt());
		}
		int result=UserMain.getYear(map);
		System.out.println(result);
	}
}
