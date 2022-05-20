package assignment_3;

import java.util.Scanner;

public class GetSumOfPower
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enetr the Size of Array ");
		int size=sc.nextInt();
		int a []=new int[size];
		System.out.println("Enter the Elements of Array ");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The sum of Power of each elements "+GetSumOfPowerUser.getSumOfPower(a));
	}
}
