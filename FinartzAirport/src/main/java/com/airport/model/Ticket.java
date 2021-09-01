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
@Table(name="Ticket")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class 
Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")        
	private String name;		  // yolcu ismi
	@Column(name="surname")
	private String surname;		  //yolcu soyadi
	@Column(name="tc_kimlik_no")
	private String tcKimlikNo;    //yolcu tc kimlik no
	@Column(name="hes_code")
	private String hesCode;		  //yolcu hes kodu
	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.MERGE)
	@JoinColumn(name="flight_id")
	private Flight flight;	    //ucus id
	
	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="credit_card_id")
	private CreditCard creditCard;	//kredi kart bilgileri
	
	@Column(name="price")
	private Double price;			//ucusa odenecek tutar
	
	public CreditCard getCreditCard() {
		return creditCard;
	}
	
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	

	



	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
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







	public Ticket(int id, String name, String surname, String tcKimlikNo, String hesCode, Flight flight,
			CreditCard creditCard, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.tcKimlikNo = tcKimlikNo;
		this.hesCode = hesCode;
		this.flight = flight;
		this.creditCard = creditCard;
		this.price = price;
	}

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
