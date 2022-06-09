package com.te.day_10.pricecalculator2;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class UserMain 
{
	static Scanner scan = new Scanner(System.in);
	public static Float costEstimator(Map<String, Float> price)
	{
		Float add=0.0f;
		System.out.println("Enter no of object to add");
		int size=scan.nextInt();
		String [] s1= new String[size];
		System.out.println("Enter the object to add");
		for (int i = 0; i < s1.length; i++) {
			s1[i]=scan.next();
			Iterator<String> itr= price.keySet().iterator();
			while(itr.hasNext())
			{
				String key=itr.next();
				if(key.equals(s1[i]))
				{
					add=add+price.get(key);
				}
			}
		}
		return add;
	}
}
