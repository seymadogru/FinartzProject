package com.airport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airline_company")
public class AirlineCompany {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")			
	private String name;			//havaalanı şirketi ismi
	@Column(name="phone")
	private String phone;			//şirket telefon no
	@Column(name="airport_name")
	private String airportName;     //bulunduğu havaalanı ismi
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public AirlineCompany(int id, String name, String phone, String airportName) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.airportName = airportName;
	}
	public AirlineCompany() {
		super();
		
	}
	
	
}
