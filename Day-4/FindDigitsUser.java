package day_4;

public class FindDigitsUser 
{
	public static String findNoDigits(double num)
	{
		String no=String.valueOf(num);
		String[] num1=no.split("\\.");
		int n1=Integer.parseInt(num1[0]);
		int n2=Integer.parseInt(num1[1]);
		int count1=0;
		int count2=0;
		while(n1>0)
		{
			n1/=10;
			count1++;
		}
		while(n2>0)
		{
			n2/=10;
			count2++;
		}
		return count1+":"+count2 ;
	}
}
