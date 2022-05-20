package assignmentPrgm;

import java.util.Scanner;

public class SumOfOddDigits 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		String str="Sum of Digit is Even";
		System.out.println("Enter the Number");
		int num=s.nextInt();
		int res=SumOfOddDigitsUser.checkSum(num);
		if(res==1)
			str="Sum of Digit is Odd";
		System.out.println(str);
	}
}
