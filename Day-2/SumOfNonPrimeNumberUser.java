package assign2;

public class SumOfNonPrimeNumberUser 
{
	public static int addNumbers(int n1)
	{
		int sum=1;
		for (int i = 2; i <= n1 ; i++) 
		{
			int count=0;
			for (int j = 2; j <= i; j++) 
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count!=1)
			{
				sum+=i;
			}
		}
		return sum;
	}
}
