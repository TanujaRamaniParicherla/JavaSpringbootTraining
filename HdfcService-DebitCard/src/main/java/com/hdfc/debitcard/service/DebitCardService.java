package com.hdfc.debitcard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hdfc.debitcard.entity.DebitCard;
import com.hdfc.debitcard.repository.DebitCardRepository;

@Service
public class DebitCardService {
	@Autowired
	DebitCardRepository debitCardRepository;

	public List<DebitCard> listAll() {
		return (List<DebitCard>) debitCardRepository.findAll();
	}

	/*
	 * public DebitCard save(DebitCard debitcard) { return
	 * debitCardRepository.save(debitcard); }
	 */
	 public DebitCard createOrUpdateEmployee(DebitCard debitcard) 
	    {
	        Optional<DebitCard> debitcard1 = debitCardRepository.findById(debitcard.getCustomerID());
	         
	        if(debitcard1.isPresent()) 
	        {
	        	DebitCard newCard = debitcard1.get();
	        	newCard.setCustomerID(debitcard.getCustomerID());
	        	newCard.setMobileNumber(debitcard.getMobileNumber());
	        	newCard.setCardNumber(debitcard.getMobileNumber());
	        	newCard = debitCardRepository.save(newCard);
	             
	            return newCard;
	        } else {
	        	debitcard = debitCardRepository.save(debitcard);
	             
	            return debitcard;
	        }
	    } 
	
	

	public DebitCard get(int customerID)  {
		Optional<DebitCard> debitcard = debitCardRepository.findById(customerID);

		if (debitcard.isPresent()) {
			return debitcard.get();
		}
		/*
		 * else { return "no such details"; }
		 */
		return null;
	}

	public void delete(int customerID) {
		debitCardRepository.deleteById(customerID);
	}
	public void deleteAll()
	{
		debitCardRepository.deleteAll();
	}

}
