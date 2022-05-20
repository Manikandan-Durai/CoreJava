package assign2;

import java.util.Scanner;

public class SumOfNonPrimeNumber 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number ");
		int n1=sc.nextInt();
		int res=SumOfNonPrimeNumberUser.addNumbers(n1);
		System.out.println(res);
	}
}
