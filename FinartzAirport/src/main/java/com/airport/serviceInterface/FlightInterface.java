package com.airport.serviceInterface;

import java.util.List;

import com.airport.model.Flight;

public interface FlightInterface {

	public List<Flight> findFlightByAirlineCompanyName(String airlineCompanyName);
	public Flight saveFlight(Flight flight);
}
