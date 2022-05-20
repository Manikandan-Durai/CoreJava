package assignment_3;

import java.util.Scanner;

public class GetBigDiff 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Size of an Array ");
		int size=sc.nextInt();
		System.out.println("Enter the Elements of an Array ");
		int a[]=new int[size];
		if(size==1)
		{
			for (int i = 0; i < a.length; i++)
			{
				a[i]=sc.nextInt();
				System.out.println("The Value is "+a[i]);
			}
		}
		else
		{
			for (int i = 0; i < a.length; i++) 
			{
				a[i]=sc.nextInt();
			}
			System.out.println("The Differnce between Largest and Smallest Number is "+GetBigDiffUser.getBigDiff(a));
		}
	}
}
