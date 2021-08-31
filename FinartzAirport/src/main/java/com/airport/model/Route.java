package com.airport.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="route")
public class Route {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="airline_company")
	private String airlineCompany;    //havaalanı şirketi
	@Column(name="departure_airport")
	private String departureAirport;  //kalkış havaalanı
	@Column(name="landing_airport")
	private String landingAirport;    //iniş havaalanı
	@Column(name="departure_time")
	private Double departureTime;     //kalkış saati
	@Column(name="date")
	private String date;			  //kalkış tarihi	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAirlineCompany() {
		return airlineCompany;
	}
	public void setAirlineCompany(String airlineCompany) {
		this.airlineCompany = airlineCompany;
	}
	public String getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}
	public String getLandingAirport() {
		return landingAirport;
	}
	public void setLandingAirport(String landingAirport) {
		this.landingAirport = landingAirport;
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
	public Route(int id, String airlineCompany, String departureAirport, String landingAirport, Double departureTime,
			String date) {
		super();
		this.id = id;
		this.airlineCompany = airlineCompany;
		this.departureAirport = departureAirport;
		this.landingAirport = landingAirport;
		this.departureTime = departureTime;
		this.date = date;
	}
	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
