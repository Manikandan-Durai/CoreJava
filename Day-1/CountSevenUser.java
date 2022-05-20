package assignmentPrgm;

public class CountSevenUser 
{
	public static int countSeven(int num)
	{
		int count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem==7)
			{
				count++;
			}
			num/=10;
		}
		return count;
	}
}
