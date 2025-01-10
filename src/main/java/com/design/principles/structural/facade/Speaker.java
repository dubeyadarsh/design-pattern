package com.design.principles.structural.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data  
@AllArgsConstructor
public class Speaker {
	private String name;
	private Integer volume = 0  ;
	
	public void turnOnSpeaker() {
		System.out.println("Speaker is ready to boom ....");
	}
	public void setVolume(Integer volume) {
		this.volume=volume;
	}
	public void turnOffSpeaker() {
		System.out.println("Speaker is turning off ....");
	}
}