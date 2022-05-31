package com.te.arraylistseat.bean;

import java.util.Date;
import java.util.List;

public class Ticket 
{
	private String refId;
	private Date dateOfJourney;
	private List<Seat> seatList;
	public Ticket(String refId, Date dateOfJourney, List<Seat> seatList) {
		super();
		this.refId = refId;
		this.dateOfJourney = dateOfJourney;
		this.seatList = seatList;
	}
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public Date getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public List<Seat> getSeatList() {
		return seatList;
	}
	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}
	@Override
	public String toString() {
		return "Ticket [refId=" + refId + ", dateOfJourney=" + dateOfJourney + ", seatList=" + seatList + "]";
	}
	public void addSeatToTicket(Seat seat)
	{
		seatList.add(seat);
	}
	
	public Boolean removeSeatFromTicket(Integer seatNo)
	{
		Boolean b=false;
		for (int i = 0; i < seatList.size(); i++)
		{
			if(seatList.get(i).getSeatNo()==seatNo)
			{
				seatList.remove(seatList.get(i));
				b=true;
			}
		}
		return b;
	}
	public void displaySeats()
	{
		for (Seat seat : seatList) {
			System.out.println(seat);
		}
	}
}
