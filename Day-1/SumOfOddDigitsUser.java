package assignmentPrgm;

public class SumOfOddDigitsUser
{
	public static int checkSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==1)
			{
				sum=sum+rem;
			}
			num/=10;
		}
		if(sum%2==1)
			return 1;
		
		return -1;
	}
}
