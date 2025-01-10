package com.design.principles.behavioral.state;

import lombok.Data;

@Data
public class TrafficLight {
	private TrafficLightState tfState;
	
	TrafficLight(TrafficLightState tfState) {
		this.tfState = tfState;
	}
	
	void setState(TrafficLightState tfState) {
		this.tfState = tfState;
	}
	
	void logCurrentState() {
		this.tfState.changeLight();
	}
	
	
	
}
