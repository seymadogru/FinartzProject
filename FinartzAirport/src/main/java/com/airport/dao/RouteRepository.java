package com.airport.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airport.model.Route;

@Repository
public interface RouteRepository extends CrudRepository<Route, Integer>{

	
	List<Route> findByDepartureAirportIdAndLandingAirportId(Integer departureAirport,Integer landingAirport);
	//kalkıs ve inis havalimanlari girildiginde o rotada bulunan ucak bilgileri verilecek.
}
