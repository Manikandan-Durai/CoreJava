package assignmentPrgm;

import java.util.Scanner;

public class SumOfSquareOfEvenDigit 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=s.nextInt();
		int res=SumOfSquareOfEvenDigitUser.sumOfSquareOfEvenDigit(num);
		System.out.println("The Sum Of Square of Even Digit is "+res);
	}
}
