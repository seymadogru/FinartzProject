package com.airport.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="route")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Route {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="airline_company")
	private String airlineCompany;    //havaalani sirketi
	@ManyToOne(fetch = FetchType.LAZY ,cascade=CascadeType.ALL)
	@JoinColumn(name="departure_airport_id")
	private Airport departureAirport;  //kalkıs havaalani
	@ManyToOne(fetch = FetchType.LAZY ,cascade=CascadeType.ALL)
	@JoinColumn(name="landing_airport_id")
	private Airport landingAirport;    //inis havaalani
	@Column(name="departure_time")
	private Double departureTime;     //kalkıs saati
	@Column(name="date")
	private String date;			  //kalkıs tarihi	
	
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
	
	public Airport getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}
	public Airport getLandingAirport() {
		return landingAirport;
	}
	public void setLandingAirport(Airport landingAirport) {
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
	
	public Route(int id, String airlineCompany, Airport departureAirport, Airport landingAirport, Double departureTime,
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
