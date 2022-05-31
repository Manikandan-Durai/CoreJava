package com.te.arraylistseat.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the ticket details");
		String tick=scan.nextLine();
		Date date= new Date();
		System.out.println(date);
		Ticket ticket=new Ticket(tick, date, new ArrayList<Seat>());
		System.out.println("Select a option");
		boolean b=true;
		while(b)
		{
			System.out.println("1.Add Seat\n2.Delete seat\n3.Display Seats\n4.Exit");
			int option=scan.nextInt();
			scan.nextLine();
			switch(option)
			{
			case 1:
				System.out.println("Enter the details ");
				String detail=scan.nextLine();
				Seat seat=Seat.createSeat(detail);
				ticket.addSeatToTicket(seat);
				System.out.println("Seat created succesfully");
				break;
			case 2:
				System.out.println("Enter the seatno to delete");
				Integer seatNo=scan.nextInt();
				Boolean remove=ticket.removeSeatFromTicket(seatNo);
				if(remove)
					System.out.println("Seat Successfully deleted");
				else
					System.out.println("Seat not found in ticket");
				break;
			case 3:
				System.out.format("%-10s %-10s %-10s %-10s %-10s\n","SeatNo","Type","Price","PassengerName","Gender");
				ticket.displaySeats();
				break;
			case 4:
				b=false;
				break;
			}
		}
	}
}
