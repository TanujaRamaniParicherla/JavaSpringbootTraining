package com.hdfc.creditcard.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.hdfc.creditcard.entity.CreditCard;

@ControllerAdvice
public class CreditCardException{
	
	 @ExceptionHandler(value = MyException.class)
	   public ResponseEntity<Object> exception(CreditCardException exception) 
	 {
	      return new ResponseEntity<>( "no such details exists",HttpStatus.NOT_FOUND);
		 
	   }
	

}
