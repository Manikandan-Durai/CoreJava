package day_4;

public class SequenceUser
{
	public static boolean checkSequence(int a[])
	{
		boolean c=false;
		for (int i = 0; i < a.length; i++) 
		{
			int k=a[i];
			for (int j = i; j < a.length; j++) 
			{
				int count=0;
				if(k==a[j])
				{
					k++;
					count++;
					if(count==2)
					{
						c=true;
					}
				}
				else
				{
					break;
				}
			}
		}
		return c;
	}
}
