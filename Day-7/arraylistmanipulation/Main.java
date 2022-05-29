package com.te.arraylistmanipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of an arraylist");
		int size=scan.nextInt();
		List<Integer> oddList= new ArrayList<Integer>(size);
		System.out.println("Enter the elements for odd list");
		for (int i = 0; i < size; i++) {
			oddList.add(scan.nextInt());
		}
		List<Integer> evenList= new ArrayList<Integer>(size);
		System.out.println("Enter the elements for even list");
		for (int i = 0; i < size; i++) {
			evenList.add(scan.nextInt());
		}
		List<Integer> result= new ArrayList<Integer>(UserMain.generateOddEvenList(oddList, evenList));
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}
}
