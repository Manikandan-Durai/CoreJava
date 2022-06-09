package com.te.day_10.stringprocessingzigzag;

import java.time.LocalDate;
import java.time.YearMonth;

public class UserMain 
{
	public static int getLastDayOfMonth(String date)
	{
		LocalDate localDate=LocalDate.parse(date);
		int num=YearMonth.of(localDate.getYear(), localDate.getMonthValue()).lengthOfMonth();
		return num;
	}
}
