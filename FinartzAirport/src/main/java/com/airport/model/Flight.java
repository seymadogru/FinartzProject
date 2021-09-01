package com.airport.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="flight")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Flight {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@ManyToOne(fetch = FetchType.LAZY ,cascade=CascadeType.MERGE)
	@JoinColumn(name="airline_company_id")  
	private AirlineCompany airlineCompany;    //havalimanı şirketi
	@Column(name="departure_time")
	private Double departureTime;         //kalkış saati
	@Column(name="date")
	private String date;                   //kalkış tarihi
	@ManyToOne(fetch = FetchType.LAZY ,cascade=CascadeType.MERGE)
	@JoinColumn(name="route_id")
	private Route route;
	@Column(name="travel_time")
	private Double travelTime;            //yolculuk süresi
	@Column(name="price")
	private Double price;       // first class fiyatı
	@OneToMany(fetch = FetchType.LAZY ,cascade=CascadeType.MERGE)
	@JoinColumn(name="flight_id")
	private List<Ticket> ticketList = new ArrayList<Ticket>();
	@Column(name="capacity")
	private int capacity;
	
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public List<Ticket> getTicketList() {
		return ticketList;
	}
	public void setTicketList(List<Ticket> ticketList) {
		this.ticketList = ticketList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	
	public AirlineCompany getAirlineCompany() {
		return airlineCompany;
	}
	public void setAirlineCompany(AirlineCompany airlineCompany) {
		this.airlineCompany = airlineCompany;
	}
	public Double getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Double departureTime) {
		this.departureTime = departureTime;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public Double getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(Double travelTime) {
		this.travelTime = travelTime;
	}
	
	
	

	public Flight(int id, AirlineCompany airlineCompany, Double departureTime, String date, Route route,
			Double travelTime, Double price) {
		super();
		this.id = id;
		this.airlineCompany = airlineCompany;
		this.departureTime = departureTime;
		this.date = date;
		this.route = route;
		this.travelTime = travelTime;
		this.price = price;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
