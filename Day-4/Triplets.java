package day_4;

import java.util.Scanner;

public class Triplets 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Size array");
		int size=sc.nextInt();
		System.out.println("Enter the elements Array");
		int a[]= new int[size];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println(TripletsUser.checkTriplets(a));
	}
}
