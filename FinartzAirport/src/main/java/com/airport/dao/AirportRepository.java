package com.airport.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airport.model.Airport;

@Repository
public interface AirportRepository extends CrudRepository<Airport , Integer>{

	List<Airport> findByCity(String city);  //şehir girilince orada olan havalimanları listelenecek
	Airport findByName(String name);  //havalimanı ismi girince bilgileri dökülecek
}
