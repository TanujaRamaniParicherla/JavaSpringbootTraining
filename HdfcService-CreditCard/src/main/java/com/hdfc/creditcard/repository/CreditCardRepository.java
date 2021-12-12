package com.hdfc.creditcard.repository;

import org.springframework.data.repository.CrudRepository;

import com.hdfc.creditcard.entity.CreditCard;

public interface CreditCardRepository extends CrudRepository<CreditCard, Integer> {

}
