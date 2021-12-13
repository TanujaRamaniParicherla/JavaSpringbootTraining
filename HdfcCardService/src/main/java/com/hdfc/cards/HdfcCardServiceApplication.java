package com.hdfc.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HdfcCardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdfcCardServiceApplication.class, args);
		System.out.println("hi card services");
	}

}
