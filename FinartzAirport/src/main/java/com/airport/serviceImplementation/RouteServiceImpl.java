package com.airport.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.dao.RouteRepository;
import com.airport.model.Route;
import com.airport.serviceInterface.RouteInterface;

@Service
public class RouteServiceImpl implements RouteInterface{

	@Autowired
	private RouteRepository routeRepository;
	
	@Override
	public List<Route> findByRouteDepartureAirportAndFlightLandingAirport(String departureAirport,
			String landingAirport) {
		
		return routeRepository.findByDepartureAirportAndLandingAirport(departureAirport, landingAirport);
	}

	@Override
	public Route saveRoute(Route route) {
		
		return routeRepository.save(route);
		
	}

}
