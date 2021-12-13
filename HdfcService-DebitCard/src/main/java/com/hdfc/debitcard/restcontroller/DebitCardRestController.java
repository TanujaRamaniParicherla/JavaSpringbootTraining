package com.hdfc.debitcard.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.debitcard.entity.DebitCard;
import com.hdfc.debitcard.service.DebitCardService;



@RestController
@RequestMapping("/debitcard")
public class DebitCardRestController {
	@Autowired
	DebitCardService debitCardService;
	@PostMapping(value="/createcardorupdatecard" )
	public ResponseEntity<DebitCard> generateCreditCard(@RequestBody DebitCard debitCard ) {
		System.out.println(debitCard);
		try {
			DebitCard debitCard1 = debitCardService.createOrUpdateEmployee(debitCard);
			return new ResponseEntity<>(debitCard1, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@GetMapping("/getcards")
	public ResponseEntity<List<DebitCard>> getCreditCardDetails() {
		try {
		      List<DebitCard> debitCard = (List<DebitCard>) debitCardService.listAll(); 
		      if (debitCard.isEmpty()) {
		        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		      }

		      return new ResponseEntity<>(debitCard, HttpStatus.OK);
		    } catch (Exception e) {
		      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		    }

	}
	@GetMapping("/selectcard/{customerID}")
	public ResponseEntity<DebitCard> getSpecificCreditCardDetails(@PathVariable("customerID") int customerID)  {
		DebitCard creditCard=debitCardService.get(customerID);
		 return new ResponseEntity<DebitCard>(creditCard, new HttpHeaders(), HttpStatus.OK);
	

	}
	
	
	@DeleteMapping("/deletecard")
	public String removeCreditCardDetails() {
		
		
		debitCardService.deleteAll();
		      return "All details deleted";

	}
	@DeleteMapping("/deletecard/{customerID}")
    public String deleteEmployeeById(@PathVariable("customerID") int customerID) 
                                                     {
		debitCardService.delete(customerID);
		return "deleted";
        
    }

}
