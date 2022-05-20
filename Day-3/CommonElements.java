package assignment_3;

import java.util.Scanner;

public class CommonElements
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("Enter the elements of 1st array");
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of 2nd array");
		int b[]=new int [size];
		for (int i = 0; i < b.length; i++) 
		{
			b[i]=sc.nextInt();
		}
		System.out.println("The Common elements sum are "+CommonElementsUser.commonElements(a, b));
	}
}
