package com.design.principles.structural.decorator;

public class MayoDecorator  extends AbstractDecorator {
	public static final double mayoCost=15;

	public MayoDecorator(Burger burger){
		super(burger);
		System.out.println("Burger is " + burger.getCost());
	}

	@Override
	double getCost() {
		return burger.getCost() + mayoCost;
	}

	@Override
	String getDescription() {
		return burger.getDescription() + " With Mayo" ;
	}

	@Override
	int getRating() {
		return burger.getRating();
	}

}

