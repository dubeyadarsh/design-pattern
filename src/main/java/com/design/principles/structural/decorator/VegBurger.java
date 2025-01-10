package com.design.principles.structural.decorator;

public class VegBurger extends Burger {
	
	public VegBurger(double cost, String desc, int rating) {
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
		// TODO Auto-generated method stub
		return super.ratingOutOf5;
	}


}
