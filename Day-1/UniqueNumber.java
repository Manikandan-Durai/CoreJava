package assignmentPrgm;

import java.util.Scanner;

public class UniqueNumber 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		String num=s.nextLine();
//		int num1=s.nextInt();
//		String num=String.valueOf(num1);
		String str="Not a Unique Number";
		int res=UniqueNumberUser.getUnique(num);
		if(res==1)
		{
			str="Unique Number";
		}
		System.out.println(str);
	}
}
