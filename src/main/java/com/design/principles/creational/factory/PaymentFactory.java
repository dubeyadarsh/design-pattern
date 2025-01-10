package com.design.principles.creational.factory;

import org.springframework.stereotype.Component;

import com.design.principles.structural.adapter.PayPalAdapter;
import com.design.principles.structural.adapter.PaypalPayment;

import jakarta.el.MethodNotFoundException;


@Component
public class PaymentFactory {

	public static PaymentService getPaymentService(String pm) {
		if( "UPI".equals(pm) ) {
			return new UpiPayment();
		}else if( "CC".equals(pm) ) {
			return new CreditCardPayment();
		}
		else if("PP".equals(pm)) {
			return new PayPalAdapter(new PaypalPayment()); 
		} // This elseif is the part of adapter design patterns not factory design patter, you may ignore it.
		
		throw new MethodNotFoundException("Instance Not found");
	}
}
