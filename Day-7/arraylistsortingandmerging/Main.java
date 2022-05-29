package com.te.arraylistsortingandmerging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Integer l1 []=new Integer[5];
		Integer l2[]=new Integer[5];
		System.out.println("Enter for first array list");
		for (int i = 0; i < l1.length; i++) {
			l1[i]=scan.nextInt();
			
		}
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(l1));
		
		System.out.println("Enter for second array list");
		for (int i = 0; i < l2.length; i++) {
			l2[i]=scan.nextInt();
		}
		List<Integer> list2=new ArrayList<Integer>(Arrays.asList(l2));
		
		List<Integer> list3=new ArrayList<Integer>();
		list3=UserMain.sortedMergedArrayList(list1, list2);
		for (Integer integer : list3) {
			System.out.println(integer);
		}
	}
}
