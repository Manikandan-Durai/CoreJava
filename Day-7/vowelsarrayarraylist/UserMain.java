package com.te.vowelsarrayarraylist;

import java.util.ArrayList;
import java.util.List;

public class UserMain
{
	public static List<String> matchCharacter(String[] str)
	{
		List<String> list= new ArrayList<String>();
		for (int i = 0; i < str.length; i++) 
		{
			if(str[i].charAt(0)==('a')||str[i].charAt(0)==('e')||str[i].charAt(0)==('i')||str[i].charAt(0)==('o')||str[i].charAt(0)==('u'))
			{
				if (str[i].charAt(str[i].length()-1)==('a')||str[i].charAt(str[i].length()-1)==('e')||str[i].charAt(str[i].length()-1)==('i')||str[i].charAt(str[i].length()-1)==('o')||str[i].charAt(str[i].length()-1)==('u')) 
				{
					list.add(str[i]);
				}
			}
		}
		return list;
	}
}
