package assign2;

import java.util.Scanner;

public class LuckySum
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Three Numbers ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int res=LuckySumUser.getLuckySum(n1, n2, n3);
		System.out.println(res);
	}
}
