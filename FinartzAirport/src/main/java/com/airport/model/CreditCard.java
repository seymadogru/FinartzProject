package com.airport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credit_card")
public class CreditCard {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="credit_card_owner_name")
	private String creditCardOwnerName;
	@Column(name="credit_card_no")
	private String creditCardNo;
	@Column(name="credit_card_expiration_date")
	private String creditCardExpirationDate;
	@Column(name="cvv")
	private String cvv;
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
