package day_4;

public class LargestSpanUser 
{
	public static int getLargestSpan(int a[])
	{
		
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			int count1=0;
			int count=0;
			System.out.println("loop "+i);
			for (int j = i; j < a.length; j++) 
			{
				count1++;
				if(a[i]==a[j])
				{
					count++;
					if(count==2)
					{
						sum=count1;
					}
				}
			}
		}
		return sum;
	}
}
