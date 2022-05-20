package assign2;

import java.util.Scanner;

public class FibonacciSum 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter a Number to sum of fibonacci series ");
		int n1=sc.nextInt();
		int res=FibonacciSumUser.getSumOfNFibos(n1);
		System.out.println("The Sum is "+res);
	}
}
