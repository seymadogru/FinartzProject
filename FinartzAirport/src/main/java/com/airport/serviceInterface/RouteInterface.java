package com.airport.serviceInterface;

import java.util.List;

import com.airport.model.Route;

public interface RouteInterface {

	public List<Route> findByRouteDepartureAirportIdAndFlightLandingAirportId(Integer departureAirport,Integer landingAirport);
	public Route saveRoute(Route route);
}
