package day_4;

import java.util.Scanner;

public class AddAndReverse
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();
		int a[]=new int[size];
		sc.nextLine();
		System.out.println("Enter the elements of array ");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		sc.nextLine();
		System.out.println("Enter a number ");
		int given=sc.nextInt();
		int res=AddAndReverseUser.addAndReverse(a,given);
		System.out.println(res);
	}
}
