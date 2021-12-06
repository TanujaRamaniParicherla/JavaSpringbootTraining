package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.CreditCard;

public interface CreditCardRepository extends CrudRepository<CreditCard, Long> {
	

}
