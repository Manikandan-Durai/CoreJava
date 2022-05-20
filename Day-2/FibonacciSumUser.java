package assign2;

public class FibonacciSumUser 
{
	public static int getSumOfNFibos(int n1)
	{
		int sum=0;
		int n2=0;
		int n3=1;
		int n4=n2+n3;
		while(n1>0)
		{
			sum=sum+n2;			
			n2=n3;
			n3=n4;
			n4=n2+n3;
			n1--;
		}
		return sum;
	}
}
