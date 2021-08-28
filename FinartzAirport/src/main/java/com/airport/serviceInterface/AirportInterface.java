package com.airport.serviceInterface;

import java.util.List;

import com.airport.model.Airport;

public interface AirportInterface {

	public List<Airport> findAirportByCity(String city);
	public Airport findAirportByName(String name);
	public Airport saveAirport(Airport airport);
}
