package com.te.elementsinarraylist;

import java.util.ArrayList;
import java.util.List;

public class UserMain 
{
	public static Integer[] arrayListSubtractor(List<Integer> list1, List<Integer> list2)
	{
		List<Integer> list=new ArrayList<Integer>(list1);
		list.addAll(list2);
		List<Integer> list3=new ArrayList<Integer>(list1);
		list3.retainAll(list2);
		List<Integer> finalList=new ArrayList<Integer>(list);
		finalList.removeAll(list3);
		for (Integer integer : finalList) {
			System.out.println(integer);
		}
		Object[] obj=finalList.toArray();
		Integer[] i1= new Integer[obj.length];
		for (int i = 0; i < i1.length; i++) {
			i1[i]=Integer.parseInt((obj[i]).toString());
		}
		
		return i1;
	}
}
