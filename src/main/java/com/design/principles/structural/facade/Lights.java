package com.design.principles.structural.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Lights {
	private String name;

	public void turnOnLight() {
		System.out.println("Thank you for wathcing the movie, Now turning on the lights  ....");
	}
	public void turnOffLight() {
		System.out.println("Turning of the lights before movie starts....");
	}
}
