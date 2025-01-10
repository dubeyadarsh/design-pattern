package com.design.principles.behavioral.strategy;

import com.design.principles.creational.factory.CreditCardPayment;
import com.design.principles.creational.factory.UpiPayment;

/**
 * Strategy pattern is similar to factory pattern , if u want to define the behaviour of your algorithm at runtime
 * we use strategy pattern.
 * Like if there is payment process service which process payment based .
 * When you want to define the behaviour of an algorithm or object we use such type of patterns.
 * For examaple :
 * We have multiple payment service and while calling processData Service i want to define the payment method then at time of initializing processData service we pass payment method in the constructor.
 */
public class StrategyRunner {

	public static void main(String[] args) {
		PaymentProcessor ps = null;
		String data = "CC";
		
		if("CC".equals(data)) {
			ps = new PaymentProcessor(new CreditCardPayment());  
		}else if("UPI".equals(data)) {
			ps = new PaymentProcessor(new UpiPayment()); 
		}else {
			throw new IllegalArgumentException("Method not found !");
		}
		
		ps.makePayment(data);
	}

}
