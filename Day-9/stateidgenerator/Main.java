package com.te.day_9.stateidgenerator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of an array");
		int size=scan.nextInt();
		System.out.println("Enter the elemenst of array");
		String [] id= new String[size];
		for (int i = 0; i < id.length; i++) 
		{
			id[i]=scan.next();
		}
		Map<String, String> stateId= new HashMap<String, String>();
		stateId=UserMain.getStateId(id);
		Iterator<String> itr=stateId.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			System.out.println(key+":"+stateId.get(key));
		}
	}
}
