package com.design.principles.creational.factory;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UpiPayment implements PaymentService{

	@Override
	public void makePayment(String data) throws IllegalArgumentException {
		if(!"UPI".equalsIgnoreCase(data)) throw new IllegalArgumentException("Invalid Argument for this payment type");
		
		log.info("Payment Succesfully done through UPI !! " + data);
	}

}
