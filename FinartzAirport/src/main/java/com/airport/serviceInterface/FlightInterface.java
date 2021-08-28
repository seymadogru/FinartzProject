package com.airport.serviceInterface;

import java.util.List;

import com.airport.model.Flight;

public interface FlightInterface {

	public List<Flight> findFlightByAirlineCompany(String airlineCompany);
	public Flight saveFlight(Flight flight);
}
