package com.design.principles.behavioral.observer;

public class Subscriber {

	private String name;
	private Channel channel;
	
	Subscriber(String name, Channel channel){
		this.channel = channel;
		this.name = name;
	}
	
	public void update() {
		System.out.println("Hey " + name + " , New video uploaded  by  : "+ channel.name);
	}
}
