package com.design.principles.creational.singleton;


/**
 * This is second way to implement Singleton Class
 * Only little drawback is, object will be created at the time of Class loading,
 * Sometime , we might not need or we may never initialized this SIngleton object.
 */
class EagerInitialization{
	public static final EagerInitialization singlep=new EagerInitialization();
	
	private EagerInitialization() {
		//
	}

}