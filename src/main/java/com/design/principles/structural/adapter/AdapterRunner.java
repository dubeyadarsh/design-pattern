package com.design.principles.structural.adapter;

import com.design.principles.creational.factory.PaymentFactory;
import com.design.principles.creational.factory.PaymentService;

/**
 * Adapter pattern allows two incompatible interfaces to work together by creating a wrapper (adapter) that translates one interface into another.
 * Adapter design pattern is more extensive version of factory pattern.
 
 * In our example of the Factory Pattern, we created a payment factory that returns an appropriate implementation of a payment method based on the user's input (e.g., UPI, CreditCard, etc.).
   However, what if the user wants to pay using a payment method that the factory doesn't support or a method that is incompatible with the factory's interface? 
   In this case, we can't directly integrate that new payment method into the existing factory without modification.
   This is where the Adapter Pattern becomes useful. The Adapter Pattern allows us to adapt the new, incompatible payment method (for example, a Paypal payment system) to the expected interface of the factory. 
   Instead of modifying the factory or the new payment system, we can create an adapter that acts as a bridge between the factory’s expected interface and the new payment method.
 
 */
public class AdapterRunner {

	public static void main(String[] args) {
 
		// Here below i have utilized example of factory pattern to understand adapter design pattern
		String paymentMethod="PP";
		
		PaymentService paymentFactory=PaymentFactory.getPaymentService(paymentMethod); // getting implementation of the interface
		
		paymentFactory.makePayment(paymentMethod); // calling method
	}

}
