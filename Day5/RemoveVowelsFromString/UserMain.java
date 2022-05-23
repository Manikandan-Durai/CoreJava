package com.te.Day5.RemoveVowelsFromString;

public class UserMain 
{
	public static String removeEvenVowels(String str)
	{
		char [] ch= new char[str.length()+1];
		int j=0;
		for (int i = 1; i < ch.length; i++) 
		{
			ch[i]=str.charAt(j);
			j++;
		}
		str="";
		for (int i = 1; i < ch.length; i++) 
		{
			if((i%2==0)&&(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'))
			{
				
			}
			else
			{
				str=str+ch[i];
			}
		}
		return str;
	}
}
