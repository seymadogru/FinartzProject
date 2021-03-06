package com.airport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="credit_card")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CreditCard {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="credit_card_owner_name")
	private String creditCardOwnerName;        //kredi karti sahibinin ismi
	@Column(name="credit_card_no")
	private String creditCardNo;				//kredi kart no
	@Column(name="credit_card_expiration_date")
	private String creditCardExpirationDate;	//son kullanma tarihi
	@Column(name="cvv")
	private String cvv;                         //cvv
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreditCardOwnerName() {
		return creditCardOwnerName;
	}
	public void setCreditCardOwnerName(String creditCardOwnerName) {
		this.creditCardOwnerName = creditCardOwnerName;
	}
	public String getCreditCardNo() {
		return creditCardNo;
	}
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	public String getCreditCardExpirationDate() {
		return creditCardExpirationDate;
	}
	public void setCreditCardExpirationDate(String creditCardExpirationDate) {
		this.creditCardExpirationDate = creditCardExpirationDate;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public CreditCard(int id, String creditCardOwnerName, String creditCardNo, String creditCardExpirationDate,
			String cvv) {
		super();
		this.id = id;
		this.creditCardOwnerName = creditCardOwnerName;
		this.creditCardNo = creditCardNo;
		this.creditCardExpirationDate = creditCardExpirationDate;
		this.cvv = cvv;
	}
	public CreditCard() {
		super();
		
	}
	
	
	
}
