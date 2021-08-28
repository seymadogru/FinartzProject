package com.airport.serviceInterface;

import java.util.List;

import com.airport.model.Route;

public interface RouteInterface {

	public List<Route> findByRouteDepartureAirportAndFlightLandingAirport(String departureAirport,String landingAirport);
	public Route saveRoute(Route route);
}
