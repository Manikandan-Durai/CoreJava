package day_4;

import java.util.Scanner;

public class MedianCalculation 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements of array ");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int res=MediancalculationUser.calculateMedian(a,size);
		
		System.out.println("The median is "+res);
	}
}
