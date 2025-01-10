package com.design.principles.creational.Prototype;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Prototype Design Pattern is a creational design pattern that allows you to create new objects
   by copying an existing object, known as a prototype. 
   This pattern is useful when creating new objects is expensive or time-consuming, 
   and you can achieve this by cloning an existing object instead of creating a new one from scratch.
   Example :
 * In the car industry, where thousands of identical cars are produced, it is more efficient to clone existing car objects rather than creating new ones from scratch. 
 * @ 2 way for cloning 1) shallow copy , 2) Deep copy
 *  If your reference fields of original object are immutable use shallow copy but if it is mutable you must go for deep copy

 * 
 * */


public class PrototypeRunner {

	public static void main(String[] args) {
		simulateShallowCopy();
		
		simulateDeepCopy();
	}
	
	/**
	 *  As fields of original object are immutable, if cloned object modify any field value it wont interfere in other objects.
	 */
	static void simulateShallowCopy() {
		ShallowBike b1= new ShallowBike();
	     b1.setColor("blue");
	     b1.setEngine("800cc");
	     b1.setSeats("1");
	     b1.setWheels("2");
	     
	     ShallowBike b2 = b1.clone();   
	     b2.setColor("red");
	     
	     System.out.println("Do Both object address are equal ?" + (b1 == b2));
	     //b1 and b2 are pointing to different memory address.
	}
	static void simulateDeepCopy() {
		DeepBike d1=new DeepBike();
		
		d1.setColor("red");
		d1.setWheels("2");
		
		d1.setEngine(new Engine("200cc","35"));
		DeepBike d2 = d1.clone();
		System.out.println("Before %%%%%");
		System.out.println("D1 engine capacity: " + d1.getEngine().getCapacity() +" D2 engine capacity: " + d2.getEngine().getCapacity() );
		d2.getEngine().setCapacity("300cc");
		System.out.println("After %%%%%");
		System.out.println("D1 engine capacity: " + d1.getEngine().getCapacity() +" D2 engine capacity: " + d2.getEngine().getCapacity() );
	   
	}
}
