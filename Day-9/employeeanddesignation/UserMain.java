package com.te.day_9.employeeanddesignation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UserMain 
{
	public static List<String> obtainDesignation(Map<String,String>map,String str)
	{
		List<String> list= new ArrayList<String>();
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			String value=map.get(key);
			if(value.equals(str))
			{
				list.add(key);
			}
		}
		return list;
	}
}
