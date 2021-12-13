package com.hdfc.cards.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HDFCCreditCard")
public class CreditCard {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CustomerId")
	int customerID;
	@Column(name = "MobileNumber")
	long mobileNumber;
	@Column(name = "CardNumber")
	long cardNumber;
	
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	public CreditCard(int customerID, long mobileNumber, long cardNumber) {
		super();
		this.customerID = customerID;
		this.mobileNumber = mobileNumber;
		this.cardNumber = cardNumber;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	

	

}