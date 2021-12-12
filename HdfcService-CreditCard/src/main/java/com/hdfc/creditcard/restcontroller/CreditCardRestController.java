package com.hdfc.creditcard.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.creditcard.entity.CreditCard;
import com.hdfc.creditcard.exceptions.MyException;
import com.hdfc.creditcard.service.CreditCardService;

@RestController
@RequestMapping("/creditcard")
public class CreditCardRestController {
	@Autowired
	CreditCardService creditCardService;
	@PostMapping(value="/createcardorupdatecard" )
	public ResponseEntity<CreditCard> generateCreditCard(@RequestBody CreditCard creditCard ) {
		System.out.println(creditCard);
		try {
			CreditCard creditCard1 = creditCardService.createOrUpdateEmployee(creditCard);
			return new ResponseEntity<>(creditCard1, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@GetMapping("/getcards")
	public ResponseEntity<List<CreditCard>> getCreditCardDetails() {
		try {
		      List<CreditCard> CreditCard = (List<CreditCard>) creditCardService.listAll(); 
		      if (CreditCard.isEmpty()) {
		        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		      }

		      return new ResponseEntity<>(CreditCard, HttpStatus.OK);
		    } catch (Exception e) {
		      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		    }

	}
	@GetMapping("/selectcard/{customerID}")
	public ResponseEntity<CreditCard> getSpecificCreditCardDetails(@PathVariable("customerID") int customerID)  {
		CreditCard creditCard=creditCardService.get(customerID);
		 return new ResponseEntity<CreditCard>(creditCard, new HttpHeaders(), HttpStatus.OK);
	

	}
	
	
	@DeleteMapping("/deletecard")
	public String removeCreditCardDetails() {
		
		
			creditCardService.deleteAll();
		      return "All details deleted";

	}
	@DeleteMapping("/deletecard/{customerID}")
    public String deleteEmployeeById(@PathVariable("customerID") int customerID) 
                                                     {
		creditCardService.delete(customerID);
		return "deleted";
        
    }


}
