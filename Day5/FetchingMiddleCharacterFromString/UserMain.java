package com.te.Day5.FetchingMiddleCharacterFromString;

public class UserMain 
{
	public static String getMiddleChar(String str)
	{
		String s="";
		char s1=str.charAt((str.length()/2)-1);
		char s2=str.charAt(str.length()/2);
		 s=s+s1+s2;
		return s;
	}
}
