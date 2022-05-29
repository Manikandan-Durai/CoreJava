package com.te.arraylistsortingandmerging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMain
{
	public static List<Integer> sortedMergedArrayList(List<Integer> list1,List<Integer> list2)
	{
		List<Integer> list = new ArrayList<Integer>();
		list1.addAll(list2);
		Collections.sort(list1);
		for (int i = 0; i < list1.size(); i++) {
			if(i==2||i==6||i==8)
			{
			list.add(list1.get(i));
			}
		}
		return list;
	}
}
