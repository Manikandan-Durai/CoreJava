package com.te.remove3multiples;

import java.util.ArrayList;
import java.util.List;

public class UserMain
{
	public static List<Integer> removeMultiplesOfThree(List<Integer> list)
	{
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 1; i <= list.size(); i++)
		{
			if(i%3!=0)
			{
				list1.add(list.get(i-1));
			}
		}
		return list1;
	}
}
