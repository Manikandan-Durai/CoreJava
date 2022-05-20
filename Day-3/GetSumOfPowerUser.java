package assignment_3;

public class GetSumOfPowerUser 
{
	public static int getSumOfPower(int a[])
	{
		int sum=1;
		for (int i = 1; i < a.length; i++) 
		{
			int j=i;
			int power=1;
			while(j>0)
			{
				power=power*a[i];
				j--;
			}
			sum=sum+power;
		}
		return sum;
	}
}
