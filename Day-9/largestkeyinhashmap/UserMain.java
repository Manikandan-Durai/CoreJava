package com.te.day_9.largestkeyinhashmap;

import java.util.Iterator;
import java.util.Map;

public class UserMain 
{
	public static String getMaxkeyValue(Map<Integer,String> map)
	{
		int temp=0;
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			if(key>temp)
			{
				temp=key;
			}
		}
		return map.get(temp);
	}
}
