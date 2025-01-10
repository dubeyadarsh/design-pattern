package com.design.principles.creational.factory;

/**
 * The Factory Pattern is a creational design pattern that enables the dynamic
   creation of objects based on specific conditions, without explicitly
   specifying the exact class of the object. It defines an interface for object
   creation while allowing subclasses or the factory itself to determine which class to instantiate. 
   
 * Example : In the Payment Service, suppose you have two
   classes, CreditCard and UPI, both implementing the Payment interface. In the
   DataProcessing Service, you need to dynamically select and call either the
   CreditCard or UPI implementation based on the user's choice. To achieve this,
   a Factory class is used to create the appropriate object at runtime,
   depending on the user's selection.
 
 */
public class RunFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String paymentMethod="UPI";
		
		PaymentService paymentFactory=PaymentFactory.getPaymentService(paymentMethod); // getting implementation of the interface
		
		paymentFactory.makePayment(paymentMethod); // calling method
	}

}
