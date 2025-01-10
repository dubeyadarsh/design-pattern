package com.design.principles.creational.factory;

import org.springframework.stereotype.Component;


@Component
public interface PaymentService {

	public void makePayment(String data) throws IllegalArgumentException;
	
}
