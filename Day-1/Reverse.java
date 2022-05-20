package assignmentPrgm;

import java.util.Scanner;

public class Reverse 
{
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) 
	{
	System.out.println("Enetr your Number");
	int num=s.nextInt();
	s.nextLine();
	System.out.println("Enter your Name ");
	String next = s.nextLine();
	System.out.println(next);
	System.out.println("The Reverse number is "+ReverseUser.reverse(num));
	}
}
