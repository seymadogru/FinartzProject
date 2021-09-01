package com.airport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.airport.model.AirlineCompany;
import com.airport.model.Airport;
import com.airport.model.Flight;
import com.airport.model.Route;
import com.airport.model.Ticket;
import com.airport.serviceImplementation.AirlineCompanyServiceImpl;
import com.airport.serviceImplementation.AirportServiceImpl;
import com.airport.serviceImplementation.FlightServiceImpl;
import com.airport.serviceImplementation.RouteServiceImpl;
import com.airport.serviceImplementation.TicketServiceImpl;

@RestController
@RequestMapping("v1/rest")
@CrossOrigin("*")
public class HomeController {

	@GetMapping("/index")
	public String GetForm(Model model) {
		
		model.addAttribute("Ticket", new Ticket());
		return "index";
	}
	@GetMapping
	public ResponseEntity<String> checkStatus(){
		return ResponseEntity.ok("OK");
	}
	
	
	
	//Airline Company Part
	
	@Autowired
	private AirlineCompanyServiceImpl airlineCompanyServiceImpl;
	
	//girilen Havayolu sirketi ismine gore havayolu sirketinin bilgilerini listeleme
	@GetMapping("/AirlineCompanyName/{name}")
	public List<AirlineCompany> getAirlineCompanyByName(@PathVariable("name") String name){
		List<AirlineCompany> airlineCompany = airlineCompanyServiceImpl.findAirlineCompanyByName(name);
		return airlineCompany;
	}
	
	//girilen havaalanı ismine gore oradaki havayolu sirketlerini goruntuleme
	@GetMapping("/AirportName/{airportName}")
	public List<AirlineCompany> getAirlineCompanyByAirportName(@PathVariable("airportName") String airportName){
		List<AirlineCompany> airlineCompany = airlineCompanyServiceImpl.findAirlineCompanyByAirportName(airportName);
		return airlineCompany;
	}
	
	//havayolu sirketi kaydetme
	@PostMapping(value="saveAirlineCompany")
	public AirlineCompany saveAirlineCompany(@RequestBody AirlineCompany airlineCompany) {
		airlineCompanyServiceImpl.saveAirlineCompany(airlineCompany);
		return airlineCompany;
	}
	
	
	
	
	
	
	
	//Airport Part
	@Autowired
	private AirportServiceImpl airportServiceImpl;
	
	//girilen sehirdeki havaalanlarini listeleme
	@GetMapping("/AirportCity/{city}")
	public List<Airport> getAirportByCity(@PathVariable("city") String city){
		List<Airport> airport = airportServiceImpl.findAirportByCity(city);
		return airport;
	}
	
	//girilen havalimanı ismine gore havalimani hakkinda bilgi verme
	@GetMapping("/Airport/{name}")
	public List<Airport> getAirportByName(@PathVariable("name") String name){
		List<Airport> airport = airportServiceImpl.findAirportByName(name);
		return airport;
	}
	
	//havalimani kaydetme
	@PostMapping(value="saveAirport")
	public Airport saveAirport(@RequestBody Airport airport) {
		airportServiceImpl.saveAirport(airport);
		return airport;
	}
	
	
	
	
	
	
	//Route Part
	
	@Autowired
	private RouteServiceImpl routeServiceImpl;
	
	//kalkıs ve inis havalimanlari girilerek rotayi gorme
	@GetMapping("/route/{departureAirport}/{landingAirport}")
	@ResponseBody
	public List<Route> getRouteByDepartureAirportAndLandingAirport(@PathVariable("departureAirport") Integer departureAirport,@PathVariable("landingAirport") Integer landingAirport) {
		List<Route> route = routeServiceImpl.findByRouteDepartureAirportIdAndFlightLandingAirportId(departureAirport, landingAirport);
		return route;
	}
	
	//rota kaydetme
	@PostMapping(value="saveRoute")
	public Route saveRoute(@RequestBody Route route) {
		routeServiceImpl.saveRoute(route);
		return route;
	}
	
	
	
	
	
	
	//Flight Part
	
	@Autowired
	private FlightServiceImpl flightServiceImpl;
	
	//havayolu sirketine uçus bilgisi kaydetme
	@PostMapping(value="saveFlight")
	public Flight saveFlight(@RequestBody Flight flight){
		flightServiceImpl.saveFlight(flight);
		return flight;
	}
	
	//havayolu sirketi ismi girilerek uzerine kayitli uçusları gorme
	@GetMapping("/Flight/{name}")
	public List<Flight> getFlightByName(@PathVariable("name") String airlineCompanyName){
		List<Flight> flight = flightServiceImpl.findFlightByAirlineCompanyName(airlineCompanyName);
		return flight;
	}
	
	//tum uçusları goruntuleme
	@GetMapping("/AllFlights")
	public List<Flight> getAllFlights(){
		return flightServiceImpl.findAllFlights();
	}
	
	//tarih girilerek o tarihteki uçusları gorme
	@GetMapping("/FlightDates/{date}")
	public List<Flight> getFlightByDate(@PathVariable("date") String date){
		List<Flight> flight = flightServiceImpl.findFlightByDate(date);
		return flight;
	}
	
	
	
	
	
	//Ticket Part
	
	@Autowired
	private TicketServiceImpl ticketServiceImpl;
	
	//bilet kaydetme
	@PostMapping(value="saveTicket")
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		ticketServiceImpl.saveTicket(ticket);
		return ticket;
	}
	
	//flight id'si girilerek alınmış bileti görme
	@GetMapping("/ticketOwners/{id}")
	public List<Ticket> getTicketByFlightNo(@PathVariable("id") Integer id){
		List<Ticket> ticket = ticketServiceImpl.findTicketById(id);
		return ticket;
	}
	
	
	
	//olusturulmus bileti silme
	@DeleteMapping("deleteTicket")
	public String deleteTicket(@RequestParam int id) {
		ticketServiceImpl.deleteTicket(id);
		return "Biletiniz Iptal Edilmistir!";
	}
	
}
