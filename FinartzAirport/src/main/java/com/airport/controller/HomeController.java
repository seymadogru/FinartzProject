package com.airport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airport.model.AirlineCompany;
import com.airport.model.Airport;
import com.airport.serviceImplementation.AirlineCompanyServiceImpl;
import com.airport.serviceImplementation.AirportServiceImpl;

@RestController
@RequestMapping("v1/rest")
@CrossOrigin("*")
public class HomeController {

	@GetMapping
	public ResponseEntity<String> checkStatus(){
		return ResponseEntity.ok("OK");
	}
	
	//Airline Company Part
	
	@Autowired
	private AirlineCompanyServiceImpl airlineCompanyServiceImpl;
	
	@GetMapping("/AirlineCompanyName/{name}")
	public List<AirlineCompany> getAirlineCompanyByName(@PathVariable("name") String name){
		List<AirlineCompany> airlineCompany = airlineCompanyServiceImpl.findAirlineCompanyByName(name);
		return airlineCompany;
	}
	
	@GetMapping("/AirportName/{airportName}")
	public List<AirlineCompany> getAirlineCompanyByAirportName(@PathVariable("airportName") String airportName){
		List<AirlineCompany> airlineCompany = airlineCompanyServiceImpl.findAirlineCompanyByAirportName(airportName);
		return airlineCompany;
	}
	
	@PostMapping(value="saveAirlineCompany")
	public AirlineCompany saveAirlineCompany(@RequestBody AirlineCompany airlineCompany) {
		airlineCompanyServiceImpl.saveAirlineCompany(airlineCompany);
		return airlineCompany;
	}
	
	
	//Airport Part
	@Autowired
	private AirportServiceImpl airportServiceImpl;
	
	@GetMapping("/AirportCity/{city}")
	public List<Airport> getAirportByCity(@PathVariable("city") String city){
		List<Airport> airport = airportServiceImpl.findAirportByCity(city);
		return airport;
	}
	
	@GetMapping("/Airport/{name}")
	public Airport getAirportByName(@PathVariable("name") String name){
		Airport airport = airportServiceImpl.findAirportByName(name);
		return airport;
	}
	
	@PostMapping(value="saveAirport")
	public Airport saveAirport(@RequestBody Airport airport) {
		airportServiceImpl.saveAirport(airport);
		return airport;
	}
	
}
