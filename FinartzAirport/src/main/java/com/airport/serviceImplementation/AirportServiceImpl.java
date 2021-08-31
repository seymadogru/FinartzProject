package com.airport.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.dao.AirportRepository;
import com.airport.model.Airport;
import com.airport.serviceInterface.AirportInterface;

@Service
public class AirportServiceImpl implements AirportInterface{

	@Autowired
	private AirportRepository airportRepository;
	
	//girilen şehirdeki havaalanlarını listeleme
	@Override
	public List<Airport> findAirportByCity(String city) {
		
		return airportRepository.findByCity(city);
	}

	//girilen havalimanı ismine göre havalimanı hakkında bilgi verme
	@Override
	public List<Airport> findAirportByName(String name) {
		
		return airportRepository.findByName(name);
	}

	//havalimanı kaydetme
	@Override
	public Airport saveAirport(Airport airport) {
		
		return airportRepository.save(airport);
	}

}
