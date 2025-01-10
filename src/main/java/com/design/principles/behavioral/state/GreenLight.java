package com.design.principles.behavioral.state;

public class GreenLight implements TrafficLightState {

	@Override
	public void changeLight() {
		System.out.println("GO ... Current Status is :  *GREEN*");
	}

}
