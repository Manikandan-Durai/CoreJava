package com.te.Day_6.ReverseSplit;

public class UserMain
{
	public static String reShape(String str,char s1)
	{
		StringBuilder stringBuilder= new StringBuilder(str);
		stringBuilder.reverse();
		str=stringBuilder.toString();
		String s2=Character.toString(s1);
		char [] ch=new char[str.length()];
		ch=str.toCharArray();
		String s3="";
		for (int i = 0; i < ch.length; i++) 
		{
			String s4=Character.toString(ch[i]);
			s3=s3.concat(s4);
			if(i<ch.length-1)
			s3=s3.concat(s2);
		}
		
		return s3;
	}
}
