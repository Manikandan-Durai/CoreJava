package day_4;

public class PerfectNumberUser
{
	public static boolean getPerfection(int num)
	{
		int sum=0;
		boolean b=false;
		for (int i = 1; i < num; i++) 
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num)
		{
			b=true;
		}
		return b;
	}
}
