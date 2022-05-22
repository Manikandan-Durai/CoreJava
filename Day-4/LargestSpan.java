package day_4;

import java.util.Scanner;

public class LargestSpan
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Size of an Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Elements of array ");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The largest Span is "+LargestSpanUser.getLargestSpan(a));
	}
}
