package com.te.Day_6.PlayingWithString;

public class UserMain 
{
	public static String formString(String [] str,int count)
	{
		String s1="";
		for (int i = 0; i < str.length; i++) 
		{
			if(str[i].length()<count)
			{
				s1=s1+"$";
			}
			else
			{
				s1=s1+str[i].charAt(count-1);
			}
			
		}
		return s1;
	}
}
