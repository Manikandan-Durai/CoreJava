package assignment_3;

import java.util.Scanner;

public class LargestAmongCorner 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the Size of an Array-Array size in odd  number ");
		int size=sc.nextInt();
		System.out.println("Enter the elments of an Array");
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The largest number is "+LargestAmongCornerUser.checkLargestAmongCorner(a));
	}
}
