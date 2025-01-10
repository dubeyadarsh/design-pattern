package com.design.principles.creational.singleton;

import java.io.Serializable;

/**
 * First way to implement Singleton class
 * Double Check Loading ***
 */
class DoubleCheckLocking implements Serializable, Cloneable{
	private static final long serialVersionUID = 1L;
	
	// Dont provide constructor instead provide a method to return same object.
	private static DoubleCheckLocking singlep;

	private DoubleCheckLocking() {
		
		/**
		 * To avoid singleton breaking through Reflection.
		 */
		if(singlep != null) {
            throw new RuntimeException("Cannot create another instance of Singleton1 via reflection!");
		}
		
	}
	
	static DoubleCheckLocking getInstance() {
		if(singlep == null) {
			synchronized(DoubleCheckLocking.class) {
				if(singlep == null) {
					singlep=new DoubleCheckLocking();
				}
			}
		}
		
		return singlep;
	}
 	
	   /**
	 * @return
	 * If your class is implementing Serializable interface and 
	 * your class is singleton then make sure to override below function to avoid breaking singleton.
	 */
	protected Object readResolve() {
	        return singlep;
	 }
	
	 /**
	 * If your singleton class is implementing Cloneable Interface then make sure to override as i have done below
	 */
	@Override
    public Object clone() throws CloneNotSupportedException {
	        throw new CloneNotSupportedException("Cloning not supported for Singleton class");
    }

}

