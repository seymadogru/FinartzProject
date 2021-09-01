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
import com.airport.model.CreditCard;
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
		AirlineCompany airlineCompany = new AirlineCompany(1,"Pegasus","0546468525","İstanbul Havalimanı", null);
		when(airlineCompanyRepository.save(airlineCompany)).thenReturn(airlineCompany);
		assertEquals(airlineCompany, airlineCompanyService.saveAirlineCompany(airlineCompany));
		
	}
	
	@Test
	public void getAirlineCompanyByNameTest() {
		String name = "İstanbul Havalimanı";
		when(airlineCompanyRepository.findByName(name)).thenReturn(Stream.of(new AirlineCompany(1,"Pegasus","0546468525","abc", null)).collect(Collectors.toList()));
		assertEquals(1, airlineCompanyService.findAirlineCompanyByName(name).size());
	}
	
	
	@Test
	public void getAirlineCompanyByAirportNameTest() {
		String airportName="Sabiha Gökçen Havalimanı";
		when(airlineCompanyRepository.findByAirportName(airportName)).thenReturn(Stream.of(new AirlineCompany(1,"Pegasus","0546468525","abc", null)).collect(Collectors.toList()));
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
		int departureAirportId =2;
		int landingAirportId = 3;
		Airport airport1 = new Airport();
		airport1.setAircraftCapacity(12);
		airport1.setCity("istanbul");
		airport1.setId(1);
		airport1.setName("istanbul");
		airport1.setPhone("12387798");
		
		Airport airport2 = new Airport();
		airport2.setAircraftCapacity(12);
		airport2.setCity("istanbul");
		airport2.setId(1);
		airport2.setName("istanbul");
		airport2.setPhone("12387798");
		
		when(routeRepository.findByDepartureAirportIdAndLandingAirportId(departureAirportId,landingAirportId)).thenReturn(Stream.of(new Route(1,"Pegasus",airport1,airport2,12.50,"2021-12-12")).collect(Collectors.toList()));
		assertEquals(1,routeServiceImpl.findByRouteDepartureAirportIdAndFlightLandingAirportId(2, 3).size());
	}
	

	@Test
	public void saveRouteTest() {
		Route route = new Route();
		route.setAirlineCompany("Pegasus");
		route.setDate("2022-12-06");
		route.setDepartureAirport(null);
		route.setDepartureTime(1.15);
		route.setId(1);
		route.setLandingAirport(null);
		
		when(routeRepository.save(route)).thenReturn(route);
		assertEquals(route, routeServiceImpl.saveRoute(route));
	}
	
	
	
	@Autowired
	private FlightServiceImpl flightServiceImpl;
	
	@MockBean
	private FlightRepository flightRepository;
	
	@Test
	public void saveFlight() {
		Flight flight = new Flight();
		flight.setAirlineCompany(null);
		flight.setCapacity(10);
		flight.setDate("2021-10-21");
		flight.setDepartureTime(10.38);
		flight.setId(1);
		flight.setPrice(105.25);
		flight.setRoute(null);
		flight.setTravelTime(1.35);
		when(flightRepository.save(flight)).thenReturn(flight);
		assertEquals(flight, flightServiceImpl.saveFlight(flight));
	}
	
	
	@Test
	public void getFlightByNameTest() {
		String name="Pegasus";
		Flight flight = new Flight();
		flight.setAirlineCompany(null);
		flight.setCapacity(10);
		flight.setDate("2021-10-21");
		flight.setDepartureTime(10.38);
		flight.setId(1);
		flight.setPrice(105.25);
		flight.setRoute(null);
		flight.setTravelTime(1.35);
		when(flightRepository.findByAirlineCompanyName(name)).thenReturn(Stream.of(new Flight()).collect(Collectors.toList()));
		assertEquals(1,flightServiceImpl.findFlightByAirlineCompanyName(name).size());
	}
	
	@Test
	public void getAllFlightsTest() {
		Flight flight = new Flight();
		flight.setAirlineCompany(null);
		flight.setCapacity(10);
		flight.setDate("2021-10-21");
		flight.setDepartureTime(10.38);
		flight.setId(1);
		flight.setPrice(105.25);
		flight.setRoute(null);
		flight.setTravelTime(1.35);
		when(flightRepository.findAll()).thenReturn(Stream.of(new Flight()).collect(Collectors.toList()));
		assertEquals(1, flightServiceImpl.findAllFlights().size());
	}
	
	
	@Test
	public void getFlightByDateTest() {
		String date = "2021-12-12";
		Flight flight = new Flight();
		flight.setAirlineCompany(null);
		flight.setCapacity(10);
		flight.setDate("2021-10-21");
		flight.setDepartureTime(10.38);
		flight.setId(1);
		flight.setPrice(105.25);
		flight.setRoute(null);
		flight.setTravelTime(1.35);
		
		when(flightRepository.findFlightByDate(date)).thenReturn(Stream.of(new Flight()).collect(Collectors.toList()));
		assertEquals(1,flightServiceImpl.findFlightByDate(date).size());
	}
	
	
	@Autowired
	private TicketServiceImpl ticketServiceImpl;
	
	@MockBean
	private TicketRepository ticketRepository;
	
	@Test
	public void saveTicketTest() {
		
		CreditCard creditCard = new CreditCard();
		creditCard.setCreditCardNo("1234567812345678");
		
		Ticket ticket = new Ticket(1,"abc","dfj","sdf","jsk",null,creditCard,12.5);
		when(ticketRepository.save(ticket)).thenReturn(ticket);
		assertEquals(ticket, ticketServiceImpl.saveTicket(ticket));
		
	}
	
	@Test
	public void getTicketByFlightNo() {
		int id = 1;
		Ticket ticket = new Ticket();
		when(ticketRepository.findTicketById(id)).thenReturn(Stream.of(ticket).collect(Collectors.toList()));
		assertEquals(1,ticketServiceImpl.findTicketById(1).size());
	}
	
	
	
	
	@Test
	public void deleteTicketTest() {
		Ticket ticket = new Ticket();
		
		when(ticketRepository.save(ticket)).thenReturn(ticket);
		ticketServiceImpl.deleteTicket(1);
		assertEquals(0, ticketServiceImpl.findTicketById(1).size());
	}
	
	
	
	
	
}
