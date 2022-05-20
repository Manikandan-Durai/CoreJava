package assign2;

public class PalindromeUser
{
	public static int addPalindrome(int n1,int n2)
	{
		if(n1>n2)
		{
			int copy=n1;
			n1=n2;
			n2=copy;
		}
		int sum=0;
		for(;n1<=n2;n1++)
		{
			int copy=n1;
			int rev=0;
			while(copy>0)
			{
				int rem=copy%10;
				rev=rev*10+rem;
				copy/=10;
			}
			if(rev==n1)
			{
				sum+=rev;
			}
		}
		return sum;
	}
}
