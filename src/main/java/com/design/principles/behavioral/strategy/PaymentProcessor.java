package com.design.principles.behavioral.strategy;

import com.design.principles.creational.factory.PaymentService;

public class PaymentProcessor {

	private PaymentService paymentService;
	
	public PaymentProcessor(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void makePayment(String data) {
		System.out.println("Payment completed successfully !!");
	}
}
