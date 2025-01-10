package com.design.principles.behavioral.observer;

/**
 * The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects. 
   When the state of one object (called the subject) changes, all dependent objects (called observers) are automatically 
  notified and updated accordingly.
 * Example :
 * Lets say there is a channel class and there are some subscriber class, any new video uploaded on channel should notify to all the subscribers of that channel.
 */
public class ObserverRunner {

	public static void main(String[] args) {

		Channel mainChannel = new Channel();
		Subscriber s1 = new Subscriber("Adarsh",mainChannel);
		Subscriber s2 = new Subscriber("John",mainChannel);
		Subscriber s3 = new Subscriber("Pat",mainChannel);
		Subscriber s4 = new Subscriber("David",mainChannel);
		Subscriber s5 = new Subscriber("Warn",mainChannel);
		
		mainChannel.subscribe(s1);
		mainChannel.subscribe(s2);
		mainChannel.subscribe(s3);
		mainChannel.subscribe(s4);
		mainChannel.subscribe(s5);
		
		mainChannel.uploadData();

		
	}

}
