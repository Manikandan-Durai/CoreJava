package com.te.Day5.FindElementPosistionInReverseStringArray;

public class UserMain
{
	public static int getElementPosition(String [] str,String input)
	{
		for (int i = 0; i < str.length-1; i++) 
		{
			String copy="";
			for (int j = i+1; j < str.length; j++)
			{
				if((str[i].charAt(0))<(str[j].charAt(0)))
				{
					copy=str[i];
					str[i]=str[j];
					str[j]=copy;
					
				}
			}
		}
		int position=1;
		for (int i = 0; i < str.length; i++) 
		{
			if(str[i].equals(input))
			{
				position+=i;
			}
		}
		return position;
	}
}
