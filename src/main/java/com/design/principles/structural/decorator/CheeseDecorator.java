package com.design.principles.structural.decorator;

public class CheeseDecorator extends AbstractDecorator {
	public static final double cheeseCost=20;

	public CheeseDecorator(Burger burger){
		super(burger);
	}

	@Override
	double getCost() {
		return super.getCost() + cheeseCost;
	}

	@Override
	String getDescription() {
		return super.getDescription() + " With Cheese" ;
	}

	@Override
	int getRating() {
		return super.getRating();
	}

}
