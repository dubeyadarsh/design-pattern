package com.design.principles.behavioral.state;

/**
 * The State Design Pattern is a behavioral design pattern that allows an object to change its behavior when its internal state changes.
 */
public class StatePatternRunner {

	public static void main(String[] args) {
		
		TrafficLight tf = new TrafficLight(new YellowLight());
		 tf.logCurrentState();
		 tf.setState(new RedLight());
		 tf.logCurrentState();
		 tf.setState(new GreenLight());
		 tf.logCurrentState();

	}

}
