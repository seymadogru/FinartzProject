package com.airport.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.airport.dao.AirlineCompanyRepository;
import com.airport.dao.AirportRepository;
import com.airport.dao.FlightRepository;
import com.airport.dao.RouteRepository;
import com.airport.dao.TicketRepository;
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

@RunWith(SpringRunner.class)
@SpringBootTest
public class HomeControllerTest {
	
	@Autowired
	private AirlineCompanyServiceImpl airlineCompanyService;
	
	@MockBean
	private AirlineCompanyRepository airlineCompanyRepository;
	
	@Test
	public void saveAirlineCompanyTest() {
		AirlineCompany airlineCompany = new AirlineCompany(1,"Pegasus","0546468525","İstanbul Havalimanı");
		when(airlineCompanyRepository.save(airlineCompany)).thenReturn(airlineCompany);
		assertEquals(airlineCompany, airlineCompanyService.saveAirlineCompany(airlineCompany));
		
	}
	
	@Test
	public void getAirlineCompanyByNameTest() {
		String name = "İstanbul Havalimanı";
		when(airlineCompanyRepository.findByName(name)).thenReturn(Stream.of(new AirlineCompany(1,"Pegasus","0546468525","abc")).collect(Collectors.toList()));
		assertEquals(1, airlineCompanyService.findAirlineCompanyByName(name).size());
	}
	
	
	@Test
	public void getAirlineCompanyByAirportNameTest() {
		String airportName="Sabiha Gökçen Havalimanı";
		when(airlineCompanyRepository.findByAirportName(airportName)).thenReturn(Stream.of(new AirlineCompany(1,"Pegasus","0546468525","abc")).collect(Collectors.toList()));
		assertEquals(1, airlineCompanyService.findAirlineCompanyByAirportName(airportName).size());
	}
	
	
	
	@Autowired
	private AirportServiceImpl airportServiceImpl;
	
	
	@MockBean
	private AirportRepository airportyRepository;
	
	@Test
	public void getAirportByCityTest() {
		String city="Ankara";
		when(airportyRepository.findByCity(city)).thenReturn(Stream.of(new Airport(1,"Esenboğa","Ankara","12456878",250)).collect(Collectors.toList()));
		assertEquals(1,airportServiceImpl.findAirportByCity(city).size());
	}
	
	@Test
	public void getAirportByNameTest() {
		String name="Adnan Menderes Havalimanı";
		when(airportyRepository.findByName(name)).thenReturn(Stream.of(new Airport(1,"Adnan Menderes Havalimanı","İzmir","12456878",250)).collect(Collectors.toList()));
		assertEquals(1,airportServiceImpl.findAirportByName(name).size());
	}
	
	@Test
	public void saveAirportTest() {
		Airport airport = new Airport(1,"Adnan Menderes Havalimanı","İzmir","12456878",250);
		when(airportyRepository.save(airport)).thenReturn(airport);
		assertEquals(airport, airportServiceImpl.saveAirport(airport));
	}
	
	
	
	
	@Autowired
	private RouteServiceImpl routeServiceImpl;
	
	@MockBean
	private RouteRepository routeRepository;
	

	@Test
	public void getRouteByDepartureAirportAndLandingAirportTest() {
		String departureAirport ="İstanbul havalimanı";
		String landingAirport = "Esenboğa Havalimanı";
		when(routeRepository.findByDepartureAirportAndLandingAirport(departureAirport, landingAirport)).thenReturn(Stream.of(new Route(1,"Pegasus","İstanbul Havalimanı","Esenboğa Havalimanı",12.50,"2021-12-12")).collect(Collectors.toList()));
		assertEquals(1,routeServiceImpl.findByRouteDepartureAirportAndFlightLandingAirport(departureAirport, landingAirport).size());
	}
	

	@Test
	public void saveRouteTest() {
		Route route = new Route(1,"Pegasus","İstanbul Havalimanı","Esenboğa Havalimanı",12.50,"2021-12-12");
		when(routeRepository.save(route)).thenReturn(route);
		assertEquals(route, routeServiceImpl.saveRoute(route));
	}
	
	
	
	@Autowired
	private FlightServiceImpl flightServiceImpl;
	
	@MockBean
	private FlightRepository flightRepository;
	
	@Test
	public void saveFlight() {
		Flight flight = new Flight(1,"abcd12234","Pegasus",12.50,"2021-02-05","İst Havalimanı","Esenboğa",1.45,150.25,250.15);
		when(flightRepository.save(flight)).thenReturn(flight);
		assertEquals(flight, flightServiceImpl.saveFlight(flight));
	}
	
	
	@Test
	public void getFlightByNameTest() {
		String name="Pegasus";
		when(flightRepository.findByAirlineCompanyName(name)).thenReturn(Stream.of(new Flight(1,"abcd12234","Pegasus",12.50,"2021-02-05","İst Havalimanı","Esenboğa",1.45,150.25,250.15)).collect(Collectors.toList()));
		assertEquals(1,flightServiceImpl.findFlightByAirlineCompanyName(name).size());
	}
	
	@Test
	public void getAllFlightsTest() {
		when(flightRepository.findAll()).thenReturn(Stream.of(new Flight(1,"abcd12234","Pegasus",12.50,"2021-02-05","İst Havalimanı","Esenboğa",1.45,150.25,250.15), new Flight(1,"cvds4567","THY",12.50,"2021-02-05","İst Havalimanı","Esenboğa",1.45,150.25,250.15)).collect(Collectors.toList()));
		assertEquals(2, flightServiceImpl.findAllFlights().size());
	}
	
	
	@Test
	public void getFlightByDateTest() {
		String date = "2021-12-12";
		when(flightRepository.findFlightByDate(date)).thenReturn(Stream.of(new Flight(1,"abcd12234","Pegasus",12.50,"2021-12-12","İst Havalimanı","Esenboğa",1.45,150.25,250.15)).collect(Collectors.toList()));
		assertEquals(1,flightServiceImpl.findFlightByDate(date).size());
	}
	
	
	@Autowired
	private TicketServiceImpl ticketServiceImpl;
	
	@MockBean
	private TicketRepository ticketRepository;
	
	@Test
	public void saveTicketTest() {
		Ticket ticket = new Ticket(1,"Şeyma","Doğru","123456789","abs45sdx","abcd1234");
		when(ticketRepository.save(ticket)).thenReturn(ticket);
		assertEquals(ticket, ticketServiceImpl.saveTicket(ticket));
		
	}
	
	@Test
	public void getTicketByFlightNo() {
		String flightNo = "abcd1234";
		when(ticketRepository.findTicketByFlightNo(flightNo)).thenReturn(Stream.of(new Ticket(1,"Şeyma","Doğru","123456789","abs45sdx","abcd1234")).collect(Collectors.toList()));
		assertEquals(1,ticketServiceImpl.findTicketByFlightNo(flightNo).size());
	}
	
	@Test
	public void getTicketByTcKimlikNoTest() {
		String tcKimlikNo = "123456789";
		when(ticketRepository.findTicketByTcKimlikNo(tcKimlikNo)).thenReturn(Stream.of(new Ticket(1,"Şeyma","Doğru","123456789","abs45sdx","abcd1234")).collect(Collectors.toList()));
		assertEquals(1,ticketServiceImpl.findTicketByTcKimlikNo(tcKimlikNo).size());
	}
	
	
	@Test
	public void deleteTicketTest() {
		Ticket ticket = new Ticket(1,"Şeyma","Doğru","123456789","abs45sdx","abcd1234");
		when(ticketRepository.save(ticket)).thenReturn(ticket);
		ticketServiceImpl.deleteTicket(1);
		assertEquals(0, ticketServiceImpl.findTicketByFlightNo("abs45sdx").size());
	}
	
	
	
	
	
}
