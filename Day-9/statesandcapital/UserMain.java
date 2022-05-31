package com.te.day_9.statesandcapital;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class UserMain 
{
	static Scanner scan=new Scanner(System.in);
	public static String getCapital(Map<String,String> map, String input)
	{
		String temp="";
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			if(input.equals(key))
			{
				temp=key;
			}
		}
		return map.get(temp)+"$"+temp;
	}
}
