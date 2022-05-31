package com.te.arraylistseat1.bean;

import java.util.Comparator;

public class PassengerNameComparator implements Comparator<Seat>
{

	@Override
	public int compare(Seat o1, Seat o2) {
		// TODO Auto-generated method stub
		return o1.getPassengerName().compareTo(o2.getPassengerName());
	}

}
