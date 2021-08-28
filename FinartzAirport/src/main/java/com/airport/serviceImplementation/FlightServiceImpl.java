package com.airport.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.dao.FlightRepository;
import com.airport.model.Flight;
import com.airport.serviceInterface.FlightInterface;

@Service
public class FlightServiceImpl implements FlightInterface{

	@Autowired
	private FlightRepository flightRepository;
	
	@Override
	public List<Flight> findFlightByAirlineCompany(String airlineCompanyName) {
		
		return flightRepository.findByAirlineCompanyName(airlineCompanyName);
	}

	@Override
	public Flight saveFlight(Flight flight) {
		
		return flightRepository.save(flight);
		
	}

}