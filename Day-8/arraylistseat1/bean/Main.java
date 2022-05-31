package com.te.arraylistseat1.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		List<Seat>	seatList=new ArrayList<Seat>();
		System.out.println("Enter the size of an Array");
		int size= scan.nextInt();
		scan.nextLine();
		System.out.println("Enter string");
		for (int i = 0; i < size; i++) {
			String  detail=scan.nextLine();
			seatList.add(Seat.createSeat(detail));
		}
		boolean b=true;
		while(b)
		{
			System.out.println("Enter a type to sort");
			System.out.println("1.Sort by seatNo\n2.Sort by passengerName\n3.exit");
			int option=scan.nextInt();
			switch(option)
			{
				case 1:
					Collections.sort(seatList);
					System.out.format("%-8s %-12s %-5s %-10s %-1s\n","SeatNo","Type","Price","PassengerName","Gender");
					for (Seat s : seatList) {
						System.out.println(s);
					}
					break;
				case 2:
					Collections.sort(seatList, new PassengerNameComparator());
					System.out.format("%-8s %-12s %-5s %-10s %-1s\n","SeatNo","Type","Price","PassengerName","Gender");
					for (Seat s : seatList) {
						System.out.println(s);
					}
					break;
				case 3:
					b=false;
					break;
			}
		}
	}
}
