package com.rgexplorer.model;

public class BookingPojo {
	
	String fromDate ;
	String toDate ;
	int noOfAdults ;
	int noOfChildrens ;
	int dateDifference;
	int totalPrice;
	String destination;
	int packagePriceSession;
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public int getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public int getNoOfChildrens() {
		return noOfChildrens;
	}
	public void setNoOfChildrens(int noOfChildrens) {
		this.noOfChildrens = noOfChildrens;
	}
	public int getDateDifference() {
		return dateDifference;
	}
	public void setDateDifference(int dateDifference) {
		this.dateDifference = dateDifference;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getPackagePriceSession() {
		return packagePriceSession;
	}
	public void setPackagePriceSession(int packagePriceSession) {
		this.packagePriceSession = packagePriceSession;
	}
	
}
