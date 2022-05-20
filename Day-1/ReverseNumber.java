package assignmentPrgm;

import java.util.Scanner;

public class ReverseNumber 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=s.nextInt();
		System.out.println("The Reverse of the Given Number is "+ReverseNumberUser.reverseNumber(num));
	}
}
