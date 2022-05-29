package com.te.elementsinarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of first arraylist");
		int size1=scan.nextInt();
		List<Integer> list1 = new ArrayList<Integer>();
		System.out.println("Enter the elements ");
		for (int i = 0; i < size1; i++) {
			list1.add(scan.nextInt());
		}
		System.out.println("Enter the size of second arraylist");
		int size2=scan.nextInt();
		List<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Enter the elements ");
		for (int i = 0; i < size2; i++) {
			list2.add(scan.nextInt());
		}
		Integer[] i1=UserMain.arrayListSubtractor(list1, list2);
		for (int i = 0; i < i1.length; i++) {
			System.out.println(i1[i]);
		}
	}
}
