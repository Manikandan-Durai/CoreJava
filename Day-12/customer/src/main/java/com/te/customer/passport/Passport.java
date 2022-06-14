package com.te.customer.passport;

import java.time.LocalDate;

public class Passport implements Display
{
	private int passNum;
	private LocalDate dateOfIssue;
	private LocalDate dateOfExpiry;
	
	public int getPassNum() {
		return passNum;
	}

	public void setPassNum(int passNum) {
		this.passNum = passNum;
	}

	public LocalDate getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String date) {
		this.dateOfIssue = LocalDate.parse(date);
	}

	public LocalDate getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String date) {
		this.dateOfExpiry = LocalDate.parse(date);
	}
	

	@Override
	public String toString() {
		return "Passport [passNum=" + passNum + ", dateOfIssue=" + dateOfIssue + ", dateOfExpiry=" + dateOfExpiry + "]";
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(passNum+" "+dateOfIssue+" "+dateOfExpiry);
	}
	
}
