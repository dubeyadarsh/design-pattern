package com.design.principles.behavioral.state;

public class YellowLight implements TrafficLightState {

	@Override
	public void changeLight() {
		System.out.println("Ready ... Current Status is :  *YELLOW*");
	}

	

}
