package com.ibs.training.java.collection.lambda;

public class Flight {
	private String flightId;
	private String origin,destination;
	private int economySeat,premiumSeat;
	
	public Flight(String flightId) {
	   this.flightId = flightId;
	}
	
	public Flight(String flightid,String o,String d,int economy,int premium) {
		this.flightId=flightid;
		this.origin=o;
		this.destination=d;
		this.economySeat=economy;
		this.premiumSeat=premium;
	}

	public void showFlightInfo() {
		System.out.println(flightId+" "+origin+" "+destination+" "+economySeat+" "+premiumSeat);
	}
	public String getFlightId() {
		return this.flightId;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getEconomySeat() {
		return economySeat;
	}

	public void setEconomySeat(int economySeat) {
		this.economySeat = economySeat;
	}

	public int getPremiumSeat() {
		return premiumSeat;
	}

	public void setPremiumSeat(int premiumSeat) {
		this.premiumSeat = premiumSeat;
	}
	
}
