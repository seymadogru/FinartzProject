package com.airport.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airport.model.Route;

@Repository
public interface RouteRepository extends CrudRepository<Route, Integer>{

	
	List<Route> findByDepartureAirportIdAndLandingAirportId(Integer departureAirport,Integer landingAirport);
	//kalkış ve iniş havalimanları girildiğinde o rotada bulunan uçak bilgileri verilecek.
}
