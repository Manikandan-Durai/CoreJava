package assign2;

public class SumSquareOfDigitsUser 
{
	public static int getSumSquareOfDigits(int n1)
	{
		int sum=0;
		while(n1>0)
		{
			int rem=n1%10;
			int square=rem*rem;
			sum+=square;
			n1/=10;
		}
		return sum;
	}
}
