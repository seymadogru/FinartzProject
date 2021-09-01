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
	
	
	//havayolu sirketine uçus bilgisi kaydetme
	@Override
	public Flight saveFlight(Flight flight) {
		
		return flightRepository.save(flight);
		
	}


	//havayolu sirketi ismi girilerek uzerine kayıtlı uçusları gorme
	@Override
	public List<Flight> findFlightByAirlineCompanyName(String airlineCompanyName) {
		
		return flightRepository.findByAirlineCompanyName(airlineCompanyName);
	}



	//tum ucusları goruntuleme
	@Override
	public List<Flight> findAllFlights() {
		
		return (List<Flight>) flightRepository.findAll();
	}



	//tarih girilerek o tarihteki ucusları gorme
	@Override
	public List<Flight> findFlightByDate(String date) {
		
		return flightRepository.findFlightByDate(date);
	}

}
