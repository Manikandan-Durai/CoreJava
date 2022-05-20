package assignmentPrgm;

public class ReverseUser 
{
	public static int reverse(int num) 
	{
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev;
		
	}
}
