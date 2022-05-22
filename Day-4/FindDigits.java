package day_4;

import java.util.Scanner;

public class FindDigits 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the Decimal value");
		double num=sc.nextDouble();
		System.out.println(FindDigitsUser.findNoDigits(num));
	}
}
