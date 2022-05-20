package assignmentPrgm;

public class UniqueNumberUser 
{
	public static int getUnique(String num)
	{
		int ret=1;
		char s1='0';
		
		for (int i = 0; i < num.length(); i++) 
		{
			if(num.charAt(0)==s1)
			{
				ret=-1;
				break;
			}
			int count=0;
			for (int j = 0; j < num.length(); j++) 
			{
				if(num.charAt(i)==num.charAt(j))
				{
					count++;
					if(count==2)
					{
						ret=-1;
						break;
					}
				}
			}
		}
		return ret;
	}
}
