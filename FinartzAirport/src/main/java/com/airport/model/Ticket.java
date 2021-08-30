package com.airport.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")
public class 
Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")      
	private String name;
	@Column(name="surname")
	private String surname;
	@Column(name="tc_kimlik_no")
	private String tcKimlikNo;
	@Column(name="hes_code")
	private String hesCode;
	@Column(name="flight_no")
	private String flightNo;
	
	
	

	public String getFlightNo() {
		return flightNo;
	}



	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}



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



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	



	public String getTcKimlikNo() {
		return tcKimlikNo;
	}



	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}



	public String getHesCode() {
		return hesCode;
	}



	public void setHesCode(String hesCode) {
		this.hesCode = hesCode;
	}



	




	public Ticket(int id, String name, String surname, String tcKimlikNo, String hesCode, String flightNo) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.tcKimlikNo = tcKimlikNo;
		this.hesCode = hesCode;
		this.flightNo = flightNo;
	}



	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
