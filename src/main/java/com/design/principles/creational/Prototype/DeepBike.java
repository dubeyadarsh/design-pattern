package com.design.principles.creational.Prototype;


import lombok.Data;

@Data
public class DeepBike implements IPrototype {
    private String wheels;
    private String color;
    private Engine engine;
   
    /**
     *
       As fields are immutable, if cloned object modify any field value it wont interfere in other objects.
     */
    @Override
	public DeepBike clone() {
    	DeepBike bk = new DeepBike();
    	bk.setColor(this.color);
//    	bk.setEngine(this.engine); // this is shallow copy , for mutable object we should not do this
    	bk.setEngine(new Engine(this.engine.getCapacity(),this.engine.getMileage())); // This is creating deep copys
    	bk.setWheels(this.wheels);
    	
    	return bk;
    }
    
  
}

