package com.te.Day5.CheckCharacters;

public class UserMain 
{
	public static int checkCharacters(String str)
	{
		int r=-1;
		if(str.charAt(0)==(str.charAt(str.length()-1)))
		{
			r=1;
		}
		return r;
	}
}
