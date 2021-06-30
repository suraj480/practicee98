package com.ibs.training.java.collection.lambda;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FlightCollectionImpl implements FlightCollection {

	HashSet<Flight> flights;
	Scanner sc = new Scanner(System.in);
	private int size = 0;

	public FlightCollectionImpl(int size) {

		this.size = size;

		flights = new HashSet<>(size);
	}

	@Override
	public boolean addFlight(Flight flight) {
		if (flights.size() < size) {
			flights.add(flight);
			return true;
		}

		return false;
	}

	@Override
	public boolean removeFlight(String flightId) {
		List<Flight> f = listFlight((o)->o.getFlightId().equals(flightId));
		//System.out.println(f.get(0).getFlightId());
		return flights.remove(f.get(0));

	}

	@Override
	public List<Flight> listFlight(Predicate<Flight> condition) {

		return flights.stream().filter(condition).collect(Collectors.toList());
	}

	
	}
}
;