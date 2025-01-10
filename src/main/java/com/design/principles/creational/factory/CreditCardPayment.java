package com.design.principles.creational.factory;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CreditCardPayment implements PaymentService{

	@Override
	public void makePayment(String data) throws IllegalArgumentException {
		if(!"CC".equalsIgnoreCase(data)) throw new IllegalArgumentException("Invalid Argument for this payment type");
	
		log.info("Payment Succesfully done through Credit card !! " , data);
	}

}

