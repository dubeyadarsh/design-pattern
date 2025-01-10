package com.design.principles.creational.singleton;

/**
 * Singleton thru enum is best, simplest and robust way.
 * Instance of enum always public and final
 * Singleton cant be broken from serialization or reflection
 */
public enum EnumSingleton {

	INSTANCE ;
	
	private String data;
	
	public void setData(String data) {
		this.data=data;
	}
	
	public String getData() {
		return this.data;
	}
	
	public void executeMethod() {
		System.out.println("This is the method of the singleton class.");
	}
}
