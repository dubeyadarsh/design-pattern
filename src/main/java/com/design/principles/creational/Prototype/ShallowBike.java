package com.design.principles.creational.Prototype;

import lombok.Data;

/**
 *  A shallow copy means creating a new object, but copying the references of the fields 
     from the original object to the new one.
 */
@Data
public class ShallowBike implements IPrototype {
    private String engine;
    private String wheels;
    private String color;
    private String seats;
   
    /**
     *
       As fields are immutable, if cloned object modify any field value it wont interfere in other objects.
     */
    @Override
	public ShallowBike clone() {
    	ShallowBike bk = new ShallowBike();
    	bk.setColor(this.color);
    	bk.setEngine(this.engine);
    	bk.setSeats(this.seats);
    	bk.setWheels(this.wheels);
    	
    	return bk;
    }
    
}
