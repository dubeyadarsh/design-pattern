package com.design.principles.creational.builder;

/**
 * The Builder pattern is used to construct complex objects, particularly when there is a need to 
   create different variations of the object or initialize its behaviors, 
   which may involve multiple properties and configurations.
 * For example there is car, we want to build different variations of the car, in that case we need car builder.
 */
public class BuilderDesignRunner {

	public static void main(String[] args) {
		 Car car1 = new Car.CarBuilder()
	                .setEngine("V8")
	                .setWheels("Alloy")
	                .setColor("Red")
	                .setSeats("Leather")
	                .build();
		 
		 System.out.println("This is car1 having engine : " + car1.getEngine() + " and having " + car1.getSeats() + " seats.");

		 Car car2 = new Car.CarBuilder().setEngine("A8").setColor("Blue").setWheels("Alloy").build();
		 
		 System.out.println("This is car2 having engine : " + car2.getEngine() + " and having " + car2.getSeats() + " seats.");

	}

}
