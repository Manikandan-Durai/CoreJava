package com.te.day_9.maxadmission;

import java.util.Iterator;
import java.util.Map;

public class UserMain 
{
	public static Integer getYear(Map<Integer,Integer>map)
	{
		int temp=0;
		int year=0;
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			int value=map.get(key);
			if(value>temp)
			{
				temp=map.get(key);
				year=key;
			}
		}
		return year;
	}
}
