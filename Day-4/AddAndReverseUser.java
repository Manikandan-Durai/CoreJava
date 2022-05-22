package day_4;

public class AddAndReverseUser 
{
	public static int addAndReverse(int a[],int given)
	{
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>given)
			{
				sum+=a[i];
			}
		}
		int rev=0;
		while(sum>0)
		{
			int rem=sum%10;
			rev=rev*10+rem;
			sum/=10;
		}
		return rev;
	}
}
