package com.hdfc.creditcard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.hdfc.creditcard.entity.CreditCard;
import com.hdfc.creditcard.exceptions.CreditCardException;
import com.hdfc.creditcard.exceptions.MyException;
import com.hdfc.creditcard.repository.CreditCardRepository;
@Service
public class CreditCardService {

	@Autowired
	CreditCardRepository creditCardRepository;

	public List<CreditCard> listAll() {
		return (List<CreditCard>) creditCardRepository.findAll();
	}

	public CreditCard save(CreditCard creditcard) {
		return creditCardRepository.save(creditcard);
	}
	 public CreditCard createOrUpdateEmployee(CreditCard creditCard) 
	    {
	        Optional<CreditCard> creditCard1 = creditCardRepository.findById(creditCard.getCustomerID());
	         
	        if(creditCard1.isPresent()) 
	        {
	        	CreditCard newCard = creditCard1.get();
	        	newCard.setCustomerID(creditCard.getCustomerID());
	        	newCard.setMobileNumber(creditCard.getMobileNumber());
	        	newCard = creditCardRepository.save(newCard);
	             
	            return newCard;
	        } else {
	            creditCard = creditCardRepository.save(creditCard);
	             
	            return creditCard;
	        }
	    } 
	
	

	public CreditCard get(int customerID)  {
		Optional<CreditCard> creditcard = creditCardRepository.findById(customerID);

		if (creditcard.isPresent()) {
			return creditcard.get();
		}
		/*
		 * else { return "no such details"; }
		 */
		return null;
	}

	public void delete(int customerID) {
		creditCardRepository.deleteById(customerID);
	}
	public void deleteAll()
	{
		creditCardRepository.deleteAll();
	}

}
