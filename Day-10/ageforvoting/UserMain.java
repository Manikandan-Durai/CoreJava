package com.te.day_10.ageforvoting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMain
{
	public static String getAge(String date1,String date2) throws ParseException
	{
		Date sd1=new SimpleDateFormat("dd/MM/yyyy").parse(date1);
		Date sd2=new SimpleDateFormat("dd/MM/yyyy").parse(date2);
		System.out.println(sd1.getYear()-sd2.getYear());
		if(sd1.getYear()-sd2.getYear()>=18)
			return "Eligible";
		else
			return "Not Eligible";
	}
}
