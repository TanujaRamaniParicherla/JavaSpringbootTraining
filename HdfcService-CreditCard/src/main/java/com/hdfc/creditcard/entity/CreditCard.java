package com.hdfc.creditcard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}
	

	public CreditCard(int customerID, long mobileNumber) {
		super();
		this.customerID = customerID;
		this.mobileNumber = mobileNumber;
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

}
