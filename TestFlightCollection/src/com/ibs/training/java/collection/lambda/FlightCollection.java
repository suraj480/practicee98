package com.ibs.training.java.collection.lambda;

import java.util.List;
import java.util.function.Predicate;

public interface FlightCollection {

	public boolean addFlight(Flight flight);
	
	public boolean removeFlight(String flightId);

	
	public List<Flight> listFlight(Predicate<Flight> condition);
	
	//accepting predicate as argument to flex the logic of search
	
	
}
