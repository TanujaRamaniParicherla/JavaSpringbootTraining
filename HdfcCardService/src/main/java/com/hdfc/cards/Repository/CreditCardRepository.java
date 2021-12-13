package com.hdfc.cards.Repository;

import org.springframework.data.repository.CrudRepository;

import com.hdfc.cards.model.CreditCard;

public interface CreditCardRepository extends CrudRepository<CreditCard, Integer> {

}
