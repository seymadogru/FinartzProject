package com.airport.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.dao.AirlineCompanyRepository;
import com.airport.model.AirlineCompany;
import com.airport.serviceInterface.AirlineCompanyInterface;

@Service
public class AirlineCompanyServiceImpl implements AirlineCompanyInterface{

	@Autowired
	private AirlineCompanyRepository airlineCompanyRepository;
	
	
	//girilen Havayolu şirketi ismine göre havayolu şirketinin bilgilerini listeleme
	@Override
	public List<AirlineCompany> findAirlineCompanyByName(String name) {
		
		return airlineCompanyRepository.findByName(name);
	}

	//girilen havaalanı ismine göre oradaki havayolu şirketlerini görüntüleme
	@Override
	public List<AirlineCompany> findAirlineCompanyByAirportName(String airportName) {
		
		return airlineCompanyRepository.findByAirportName(airportName);
	}

	//havayolu şirketi kaydetme
	@Override
	public AirlineCompany saveAirlineCompany(AirlineCompany airlineCompany) {
		
		return airlineCompanyRepository.save(airlineCompany);
	}

}
