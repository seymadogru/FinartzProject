package com.airport.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airport.model.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight , Integer>{

	List<Flight> findByAirlineCompanyName(String airlineCompanyName); //havayolu şirketi ismi girilince ona tanımlı uçuşlar listelenecek
	List<Flight> findFlightByDate(String date);   //tarihe göre uçuşları listeleme
}
