package com.te.arraylistmanipulation;

import java.util.ArrayList;
import java.util.List;

public class UserMain
{
	public static List<Integer> generateOddEvenList(List<Integer> odd, List<Integer> even)
	{
		List<Integer> result=new ArrayList<Integer>();
		int size=odd.size();
		int i=0;
		while(size>i)
		{
			if(i%2==0)
			{
				result.add(even.get(i));
			}
			else
			{
				result.add(odd.get(i));
			}
			i++;
		}
		return result;
	}
}
