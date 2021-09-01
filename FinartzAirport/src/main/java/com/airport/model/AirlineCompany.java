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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="airline_company")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class AirlineCompany {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")			
	private String name;			//havaalani sirketi ismi
	@Column(name="phone")
	private String phone;			//sirket telefon no
	@Column(name="airport_name")
	private String airportName;     //bulundugu havaalani ismi
//	@OneToMany(fetch = FetchType.LAZY ,cascade=CascadeType.ALL)
//	@JoinColumn(name="airline_company_id")
//	private List<Flight> flightList = new ArrayList<Flight>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
//	public List<Flight> getFlightList() {
//		return flightList;
//	}
//	public void setFlightList(List<Flight> flightList) {
//		this.flightList = flightList;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	
	public AirlineCompany(int id, String name, String phone, String airportName, List<Flight> flightList) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.airportName = airportName;
		//this.flightList = flightList;
	}
	public AirlineCompany() {
		super();
		
	}
	
	
}
