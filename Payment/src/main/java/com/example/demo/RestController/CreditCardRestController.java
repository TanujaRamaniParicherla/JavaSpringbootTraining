package com.example.demo.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CreditCard;
import com.example.demo.Repository.CreditCardRepository;

@RestController
@RequestMapping("/bank/pay/cards")
public class CreditCardRestController {

	@Autowired
	CreditCardRepository creditCardRepository;

	@PostMapping(value="/createcard" )
	public ResponseEntity<CreditCard> generateCreditCard(@RequestBody CreditCard creditCard ) {
		System.out.println(creditCard);
		try {
			CreditCard creditCard1 = creditCardRepository.save(creditCard);
			
			
			return new ResponseEntity<>(creditCard1, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/getcards")
	public ResponseEntity<List<CreditCard>> getCreditCardDetails() {
		try {
		      List<CreditCard> CreditCard = (List<CreditCard>) creditCardRepository.findAll();
		      
		      if (CreditCard.isEmpty()) {
		        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		      }

		      return new ResponseEntity<>(CreditCard, HttpStatus.OK);
		    } catch (Exception e) {
		      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		    }

	}

	@GetMapping("/selectcard/{cardNumber}")
	public ResponseEntity<CreditCard> getSpecificCreditCardDetails(@PathVariable("cardNumber") long cardNumber) {
	Optional<CreditCard> creditCard = creditCardRepository.findById(cardNumber);
	
	    if (creditCard.isPresent()) {
	      return new ResponseEntity<>(creditCard.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	}

	@PutMapping("/editcard/{cardNumber}")
	public ResponseEntity<CreditCard> EditCreditCardDetails(@PathVariable("cardNumber") long cardNumber,@RequestBody CreditCard creditCard) {
		
		Optional<CreditCard> creditCard1 = creditCardRepository.findById(cardNumber);
	    if (creditCard1.isPresent()) {
	      CreditCard CCard = creditCard1.get();
	      CCard.setCardHolderName(creditCard.getCardHolderName());
	      CCard.setCardNumber(creditCard.getCardNumber());
	      CCard.setCvv(creditCard.getCvv());
	      CCard.setExpiryDate(creditCard.getExpiryDate());
	      return new ResponseEntity<>(creditCardRepository.save(CCard), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }

	
	

	@DeleteMapping("/deletecard")
	public ResponseEntity<HttpStatus> removeCreditCardDetails() {
		
		try {
		      creditCardRepository.deleteAll();
		      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    } catch (Exception e) {
		      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		    }

	}
	@DeleteMapping("/deletecard/{cardNumber}")
	public ResponseEntity<HttpStatus> removeSpecificCreditCardDetails(@PathVariable("cardNumber") long cardNumber) {
		try {
		creditCardRepository.deleteById(cardNumber);
		      return new ResponseEntity<>(HttpStatus.OK);
		    } catch(Exception e){
		      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    }

	}

}
