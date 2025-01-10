package com.design.principles.structural.adapter;

import com.design.principles.creational.factory.PaymentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayPalAdapter implements PaymentService {

	private PaypalPayment paypalPayment;

    public PayPalAdapter(PaypalPayment paypalPayment) {
        this.paypalPayment = paypalPayment;
    }
    
	@Override
	public void makePayment(String data) throws IllegalArgumentException {
		if(!"PP".equalsIgnoreCase(data)) throw new IllegalArgumentException("Invalid Argument for this payment type");
		
		paypalPayment.makepayPalPayment(200);  // calling paypal method from here 
		
		log.info("Payment Succesfully done through Pay pal !! " , data);
	}

}
