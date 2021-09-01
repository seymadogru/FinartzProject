package com.airport.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airport.model.Airport;

@Repository
public interface AirportRepository extends CrudRepository<Airport , Integer>{

	List<Airport> findByCity(String city);  //sehir girilince orada olan havalimanlari listelenecek
	List<Airport> findByName(String name);  //havalimani ismi girince bilgileri dokulecek
}
