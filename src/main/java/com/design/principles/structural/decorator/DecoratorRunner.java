package com.design.principles.structural.decorator;

/**
 * The Decorator Pattern is used to dynamically enhance or modify the properties
 * or behavior of an object, such as adding new functionality or modifying
 * existing functionality. This is done by wrapping the object with one or more
 * decorators, which return the decorated object with the original object still
 * accessible at runtime.
 * 
 * But Why to use decorator ???#############
 * 
 * When designing an application for a restaurant like BurgerKing, there are
 * multiple burger combinations (e.g., Veg Burger + Chicken Burger).
 * Additionally, each burger has various optional toppings (e.g., extra cheese,
 * extra bacon, extra mayo), each with a specific cost.
 * 
 * Without the Decorator Pattern, you would likely end up creating separate
 * classes for every possible combination (e.g., VegBurgerWithExtraCheese,
 * ChickenBurgerWithExtraBacon, VegBurgerWithExtraCheeseAndMayo, etc.). This
 * approach leads to code duplication, poor readability, and maintenance
 * challenges.
 * 
 * To overcome this, the Decorator Pattern allows you to dynamically decorate
 * the burger object by adding toppings at runtime, without creating separate
 * classes for each combination. This way, you can enhance the burger's
 * properties or behavior (like adding cheese, bacon, or mayo) while keeping the
 * code clean, readable, and easily extensible.
 
 * Adding a new topping (e.g., a PickleDecorator) doesn't require changes to
 * existing code. You only need to add the new decorator class.
 */
public class DecoratorRunner {

	public static void main(String[] args) {
		Burger bg1=new VegBurger(49,"Veg Burger", 4);
		Burger bg2=new VegBurger(48,"Veg Burger", 3);
		Burger bg3 = new ChickenBurger(98, "Chicken Burger", 4);
		
		System.out.println(bg1.description+" Some info : rating  : " + bg1.ratingOutOf5 +" cost : "+bg1.cost );
		System.out.println(bg2.description+" Some info : rating  : " + bg2.ratingOutOf5 +" cost : "+bg2.cost );

		System.out.println(bg3.description+" Some info : rating  : " + bg3.ratingOutOf5 +" cost : "+bg3.cost );

//		
		bg1=new CheeseDecorator(bg1);
		bg1=new MayoDecorator(bg1);
		System.out.println(bg1.getDescription() + " cost is : " + bg1.getCost() + " and rating is "+ bg1.getRating());

		//		
//		System.out.println("Some info after deco : rating  : " + deco.ratingOutOf5 +" cost : "+deco.cost );

	}

}
