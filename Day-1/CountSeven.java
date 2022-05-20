package assignmentPrgm;

import java.util.Scanner;

public class CountSeven 
{
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number ");
		int num=s.nextInt();
		System.out.println("The Count of Number 7 Present in your Number is "+CountSevenUser.countSeven(num));
	}
}
