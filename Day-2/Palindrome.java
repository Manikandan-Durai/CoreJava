package assign2;

import java.util.Scanner;

public class Palindrome
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter Two number ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int res=PalindromeUser.addPalindrome(n1, n2);
		System.out.println("The Add of palindrome Number is "+res);
	}
}
