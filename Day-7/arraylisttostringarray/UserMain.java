package com.te.arraylisttostringarray;

import java.util.List;

public class UserMain
{
	public static String[] convertToStringArray(List<String> list)
	{
		Object[] obj=list.toArray();
		String [] str= new String[obj.length];
		for (int i = 0; i < str.length; i++) {
			str[i]=obj[i].toString();
		}
		return str;
	}
}
