package com.design.principles.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

	public static final String name = "MY CHANNEL";
	private List<Subscriber> subscribers = new ArrayList<>();
	
	public void subscribe(Subscriber s) {
		subscribers.add(s);
	}
	public void notifySub() {
		for(Subscriber s : subscribers) {
			s.update();
		}
	}
	public void unsubscribe(Subscriber s) {
		subscribers.remove(s);
	}
	public void uploadData() {
		System.out.println("Data uploaded in channel");
		notifySub();
	}
}
