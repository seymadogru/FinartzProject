package com.airport.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="flight_no")
	private String flightNno;
	@Column(name="airline_company_name")  
	private String airlineCompanyName;    //havalimanı şirketi
	@Column(name="departure_time")
	private Double departureTime;         //kalkış saati
	@Column(name="date")
	private String date;                    //kalkış tarihi
	@Column(name="departure_airport")
	private String departureAirport;      //kalkış havaalanı
	@Column(name="landing_airport")
	private String landingAirport;        //iniş havaalanı
	@Column(name="travel_time")
	private Double travelTime;            //yolculuk süresi
	@Column(name="first_class_price")
	private Double firstClassPrice;       // first class fiyatı
	@Column(name="economy_class_price")
	private Double economyClassPrice;     //ekonomi sınıfı fiyatı
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public String getFlightNno() {
		return flightNno;
	}
	public void setFlightNno(String flightNno) {
		this.flightNno = flightNno;
	}
	public String getAirlineCompanyName() {
		return airlineCompanyName;
	}
	public void setAirlineCompanyName(String airlineCompanyName) {
		this.airlineCompanyName = airlineCompanyName;
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
	public Double getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(Double travelTime) {
		this.travelTime = travelTime;
	}
	public Double getFirstClassPrice() {
		return firstClassPrice;
	}
	public void setFirstClassPrice(Double firstClassPrice) {
		this.firstClassPrice = firstClassPrice;
	}
	public Double getEconomyClassPrice() {
		return economyClassPrice;
	}
	public void setEconomyClassPrice(Double economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}
	
	public Flight(int id, String flightNno, String airlineCompanyName, Double departureTime, String date,
			String departureAirport, String landingAirport, Double travelTime, Double firstClassPrice,
			Double economyClassPrice) {
		super();
		this.id = id;
		this.flightNno = flightNno;
		this.airlineCompanyName = airlineCompanyName;
		this.departureTime = departureTime;
		this.date = date;
		this.departureAirport = departureAirport;
		this.landingAirport = landingAirport;
		this.travelTime = travelTime;
		this.firstClassPrice = firstClassPrice;
		this.economyClassPrice = economyClassPrice;
	}
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
