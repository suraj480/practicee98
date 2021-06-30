package com.ibs.training.java.collection.lambda;

import java.util.HashSet;
import java.util.List;

public class TestFlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlightCollection impl =  new FlightCollectionImpl(10);
		//write code to add 10 addFlight
		
		impl.addFlight(new Flight ("R101","BLG","KOL",40,39));
		impl.addFlight(new Flight ("R102","BLS","KER",40,0));
		impl.addFlight(new Flight ("R103","SH","KL",0,39));
		impl.addFlight(new Flight ("R104","PTA","TG",50,0));
		impl.addFlight(new Flight ("R105","TOKYO","TRV",70,96));
		impl.addFlight(new Flight ("R106","GR","SAM",80,14));
		impl.addFlight(new Flight ("R107","PG","BSR",90,39));
		impl.addFlight(new Flight ("R108","TOKYO","UL",0,34));
		impl.addFlight(new Flight ("R109","HB","VR",43,44));
		impl.addFlight(new Flight ("R110","KP","UM",12,78));
		
	//	impl.listAll();
		
		
		
		//write a code to remove flight with the ID xxxx
	//	impl.removeFlight("R101");
	//	impl.listAll();
//		
		System.out.println("list of premium flights : ");
		//write a code to list all premium flight
		List<Flight> premiumFlights = impl.listFlight((f)->f.getPremiumSeat()>0);
		for(Flight fl : premiumFlights) {
			fl.showFlightInfo();
		}
		
		System.out.println("list of economy flights : ");
		//write a code to list all economy flight
		List<Flight> economyFlights = impl.listFlight((f)->f.getEconomySeat()>0);
		for(Flight fl : economyFlights) {
			fl.showFlightInfo();
		}
		
		System.out.println("\n");
		//write a code to list all flight start from Tokyo or any city
		List<Flight> Flights = impl.listFlight((f)->f.getOrigin().startsWith("TOKYO"));
		for(Flight fl : Flights) {
			fl.showFlightInfo();
		}
		
	}

}
