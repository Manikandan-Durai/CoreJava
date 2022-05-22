package day_4;

import java.util.Arrays;

public class MediancalculationUser 
{
	public static int calculateMedian(int []a,int size)
	{
		int median=0;
		Arrays.sort(a);
		if(size%2!=0)
		{
			int middle=size/2;
			median=a[middle];
		}
		else
		{
			int middle=size/2;
			int middle1=middle-1;
			median=(a[middle]+a[middle1])/2;
		}
		return median;
		
	}
}
