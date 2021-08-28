package com.airport.serviceInterface;

import java.util.List;

import com.airport.model.AirlineCompany;

public interface AirlineCompanyInterface {

	public List<AirlineCompany> findAirlineCompanyByName(String name);
	public List<AirlineCompany> findAirlineCompanyByAirportName(String airportName);
	public AirlineCompany saveAirlineCompany(AirlineCompany airlineCompany);

}
