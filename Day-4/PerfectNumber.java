package day_4;

import java.util.Scanner;

public class PerfectNumber 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number ");
		int num=sc.nextInt();
		System.out.println(PerfectNumberUser.getPerfection(num));
	}
}
