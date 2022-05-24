package com.te.Day_6.StringOccurence;

public class UserMain 
{
	public static int getSubString(String s1,String s2)
	{
		int i=0;
		String [] s=s1.split(s2);
		if(s.length==1)
			i=0;
		else
			i=s.length;
		return i;
	}
}
