package com.te.arraylisttostringarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array list");
		int size=scan.nextInt();
		scan.nextLine();
		List<String> list=new ArrayList<String>();
		for (int i = 0; i < size; i++) {
			list.add(scan.nextLine());
		}
		Collections.sort(list);
		String[] str=UserMain.convertToStringArray(list);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
