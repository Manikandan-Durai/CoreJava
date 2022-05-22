package day_4;

import java.util.Scanner;

public class EvenSum 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("Enter the elements of an array ");
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The Sum is "+EvenSumUser.sumElements(a));
	}
}
