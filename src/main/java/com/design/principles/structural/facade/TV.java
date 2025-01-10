package com.design.principles.structural.facade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class TV {
	private String name;
	private String size;
	
	public void turnOnTV() {
		System.out.println("TV IS STARTED ....");
	}
	public void turnOffTv() {
		System.out.println("TV is turning off ....");
	}
}
