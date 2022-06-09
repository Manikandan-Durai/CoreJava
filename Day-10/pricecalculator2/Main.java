package com.te.day_10.pricecalculator2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		Map<String, Float> price= new HashMap<String, Float>();
		System.out.println("Enetr the no of objects");
		int size=scan.nextInt();
		for (int i = 0; i < size; i++) {
			price.put(scan.next(), scan.nextFloat());
		}
		Float result=UserMain.costEstimator(price);
		System.out.println(result);
	}
}
