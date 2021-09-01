package com.airport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Airport")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Airport {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")      
	private String name;				//havaalanı ismi
	@Column(name="city")
	private String city;				//havaalanının bulunduğu şehir
	@Column(name="phone")
	private String phone;				//havaalanı tel no
	@Column(name="aircraft_capacity")
	private int aircraftCapacity;		//uçak kapasitesi
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAircraftCapacity() {
		return aircraftCapacity;
	}
	public void setAircraftCapacity(int aircraftCapacity) {
		this.aircraftCapacity = aircraftCapacity;
	}
	public Airport(int id, String name, String city, String phone, int aircraftCapacity) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.phone = phone;
		this.aircraftCapacity = aircraftCapacity;
	}
	public Airport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
