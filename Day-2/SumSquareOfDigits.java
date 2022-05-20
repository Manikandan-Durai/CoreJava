package assign2;

import java.util.Scanner;

public class SumSquareOfDigits 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number ");
		int n1=sc.nextInt();
		int res=SumSquareOfDigitsUser.getSumSquareOfDigits(n1);
		System.out.println(res);
	}
}
