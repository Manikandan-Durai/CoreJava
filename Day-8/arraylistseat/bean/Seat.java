package com.te.arraylistseat.bean;

import java.text.DecimalFormat;

public class Seat 
{
	private Integer seatNo;
	private String type;
	private Double price;
	private String passengerName;
	private String gender;
	DecimalFormat decimalFormat=new DecimalFormat("0.00");
	public Seat(Integer seatNo, String type, Double price, String passengerName, String gender) {
		super();
		this.seatNo = seatNo;
		this.type = type;
		this.price = price;
		this.passengerName = passengerName;
		this.gender = gender;
	}
	public Integer getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10s %-10s %-30s\n",seatNo,type,decimalFormat.format(price),passengerName,gender);
	}
	public static Seat createSeat(String detail)
	{
			String[] s1=detail.split(",");
			Seat seat=new Seat(Integer.parseInt(s1[0]), s1[1], Double.parseDouble(s1[2]), s1[3], s1[4]);	
			return seat;	
	}
}
