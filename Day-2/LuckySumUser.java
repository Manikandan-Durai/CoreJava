package assign2;

public class LuckySumUser 
{
	public static int getLuckySum(int n1,int n2,int n3)
	{
		int sum=0;
		if(n1<10 && n2<10 && n3<10)
		{
			sum=n1+n2+n3;
		}
		else if(n1<10 && n2<10 && n3>=10)
		{
			sum=n1+n2;
		}
		else if(n1>=10 && n2<10 && n3<10)
		{
			sum=n3;
		}
		else
		{
			return sum;
		}
		return sum;
	}
}
