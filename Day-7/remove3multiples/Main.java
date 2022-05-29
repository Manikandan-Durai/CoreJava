package com.te.remove3multiples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size for Array list ");
		int size=scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <size; i++) 
		{
			list.add(scan.nextInt());
		}
		list=UserMain.removeMultiplesOfThree(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
