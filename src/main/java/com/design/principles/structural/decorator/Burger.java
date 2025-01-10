package com.design.principles.structural.decorator;

public abstract class Burger {

	protected double cost;
	protected String description;
	protected int ratingOutOf5 ;
	
	
	abstract double getCost();
	
	abstract String getDescription();
	
	abstract int getRating();
	
}
