package day_4;

import java.util.Scanner;

public class Remove10s
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.println("Enter the elements of array ");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		b=Remove10sUser.removeTens(a);
		System.out.println("tens removed array");
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
	}
}
