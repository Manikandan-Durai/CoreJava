package assignmentPrgm;

public class SumOfSquareOfEvenDigitUser
{
	public static int sumOfSquareOfEvenDigit(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				int square=rem*rem;
				sum+=square;
			}
			num/=10;
		}
		
		return sum;
	}
}
