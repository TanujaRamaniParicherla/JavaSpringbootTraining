package com.example.demo.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CreditCard")
public class CreditCard  {
	@Id
	@Column(name = "CardNumber")
	private long cardNumber;
	
	@Column(name = "ExpiryDate")
	private String expiryDate;
	
	@Column(name = "CVV")
	private int cvv;
	
	@Column(name = "HolderName")
	private String cardHolderName;

	public CreditCard() {
		// TODO Auto-generated constructor stub
	}
	

	public CreditCard(long cardNumber, String expiryDate, int cvv, String cardHolderName) {
		super();
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
		this.cardHolderName = cardHolderName;
	}


	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String toString() {
		return cardNumber+expiryDate+cvv+cardHolderName;
	}

}
