package day_4;

public class EvenSumUser
{
	public static int sumElements(int a[])
	{
		int sum=0;
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2!=0)
			{
				count++;
			}
		}
		for (int i = 0; i < a.length-1; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					a[i]=0;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
			{
				sum+=a[i];
			}
		}
		if(count==a.length)
		{
			return -1;
		}
		else
		{
			return sum;
		}
	}
}
