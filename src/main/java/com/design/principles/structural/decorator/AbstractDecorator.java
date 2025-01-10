package com.design.principles.structural.decorator;

public abstract class AbstractDecorator extends Burger{
	protected Burger burger;
	
	AbstractDecorator(Burger burger){
		this.burger=burger;
	}
	@Override
	double getCost() {
		return burger.cost;
	}

	@Override
	String getDescription() {
		return burger.description ;
	}

	@Override
	int getRating() {
		return burger.ratingOutOf5;
	}
}
