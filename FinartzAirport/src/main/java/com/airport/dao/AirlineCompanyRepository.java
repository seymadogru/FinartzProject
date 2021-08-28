package com.airport.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airport.model.AirlineCompany;

@Repository
public interface AirlineCompanyRepository extends CrudRepository<AirlineCompany , Integer>{

	List<AirlineCompany> findByName(String name);  //şirket ismi girilince bilgiler dökülecek.
	List<AirlineCompany> findByAirportName(String airportName);  //havaalanı ismi girilince oradaki şirketler listelenecek
	
}
