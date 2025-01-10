package com.design.principles.behavioral.state;

public class RedLight implements TrafficLightState {

	@Override
	public void changeLight() {
		System.out.println("Wait ... Current Status is :  *RED*");
	}

	

}
