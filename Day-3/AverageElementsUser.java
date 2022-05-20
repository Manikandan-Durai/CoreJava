package assignment_3;

public class AverageElementsUser 
{
	public static double averageElements(int a[])
	{
		int count=1;
		double add=a[2];
		for (int i = 2; i < a.length; i++) 
		{
			int count_1=0;
			for (int j = 2; j <i; j++) 
			{
				if(i%j==0)
				{
					break;
				}
				if(count_1==0)
				{
					count++;
					add+=a[i];
					break;
				}
			}
		}
		double res=add/count;
		return res;
	}
}
