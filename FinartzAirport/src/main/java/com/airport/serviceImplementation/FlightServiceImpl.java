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
	
	
	//havayolu şirketine uçuş bilgisi kaydetme
	@Override
	public Flight saveFlight(Flight flight) {
		
		return flightRepository.save(flight);
		
	}


	//havayolu şirketi ismi girilerek üzerine kayıtlı uçuşları görme
	@Override
	public List<Flight> findFlightByAirlineCompanyName(String airlineCompanyName) {
		
		return flightRepository.findByAirlineCompanyName(airlineCompanyName);
	}



	//tüm uçuşları görüntüleme
	@Override
	public List<Flight> findAllFlights() {
		
		return (List<Flight>) flightRepository.findAll();
	}



	//tarih girilerek o tarihteki uçuşları görme
	@Override
	public List<Flight> findFlightByDate(String date) {
		
		return flightRepository.findFlightByDate(date);
	}

}
