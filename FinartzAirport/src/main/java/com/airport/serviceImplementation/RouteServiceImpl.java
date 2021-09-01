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
	
	//kalkış ve iniş havalimanları girilerek rotayı görme
	@Override
	public List<Route> findByRouteDepartureAirportIdAndFlightLandingAirportId(Integer departureAirport,
			Integer landingAirport) {
		
		return routeRepository.findByDepartureAirportIdAndLandingAirportId(departureAirport, landingAirport);
	}

	//rota kaydetme
	@Override
	public Route saveRoute(Route route) {
		
		return routeRepository.save(route);
		
	}

}
