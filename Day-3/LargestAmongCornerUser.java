package assignment_3;

public class LargestAmongCornerUser
{
	public static int checkLargestAmongCorner(int a[])
	{
		int large=0;
		for (int i = 0; i < a.length; i++) 
		{
			if((a[0]>a[a.length/2])&&(a[0]>a[a.length-1]))
			{
				large=a[0];
				return large;
			}
			else if(a[a.length/2]>a[a.length-1])
			{
				large=a[a.length/2];
				return large;
			}
			else
			{
				large=a[a.length-1];
				return large;
			}
		}
		return large;
	}
}
