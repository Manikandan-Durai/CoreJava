package com.te.Day_6.RepeatFront;

public class UserMain 
{
	public static String repeatFirstThreeCharacters(String str,int count)
	{
		String str1="";
		if(str.length()<3)
		{
			for (int i = 0; i < count; i++) 
			{
				str1=str1.concat(str);
			}
		}
		else
		{
			str=str.substring(0,3);
			for (int i = 0; i < count; i++) 
			{
				str1=str.concat(str);
			}
		}
		return str1;
	}
}
