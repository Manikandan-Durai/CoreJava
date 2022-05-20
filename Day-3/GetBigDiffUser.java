package assignment_3;

import java.util.Arrays;

public class GetBigDiffUser
{
	public static int getBigDiff(int a[])
	{
		int diff=0;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) 
		{
			diff=a[a.length-1]-a[0];
		}
		return diff;
	}
}
