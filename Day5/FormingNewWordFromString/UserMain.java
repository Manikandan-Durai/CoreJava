package com.te.Day5.FormingNewWordFromString;

public class UserMain 
{
	public static String formNewWord(String str,int num)
	{
		StringBuffer stringBuffer=new StringBuffer();
		String s1=str.substring(0,num);
		String s2=str.substring(str.length()-num);
		stringBuffer.append(s1).append(s2);
		str=stringBuffer.toString();
		return str;
	}
}
