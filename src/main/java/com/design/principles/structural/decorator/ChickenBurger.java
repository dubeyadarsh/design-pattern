package com.design.principles.structural.decorator;


public class ChickenBurger extends Burger {
	
	public ChickenBurger(double cost, String desc, int rating) {
		super.cost = cost;
		super.description = desc;
		super.ratingOutOf5 = rating;
	}
	
	@Override
	double getCost() {
		return super.cost ;
	}

	@Override
	String getDescription() {
		return super.description;
	}

	@Override
	int getRating() {
		return super.ratingOutOf5;
	}


}