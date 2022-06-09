package com.te.day_10.leapyear;

import java.time.LocalDate;

public class UserMain 
{
	public static boolean isLeapYear(String date) 
	{
		boolean b=false;
		LocalDate localDate = LocalDate.parse(date);
		if(localDate.isLeapYear())
			b=true;
		
		return b;
	}
}
