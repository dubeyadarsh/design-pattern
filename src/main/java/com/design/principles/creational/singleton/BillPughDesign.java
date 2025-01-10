package com.design.principles.creational.singleton;

/**
 * This is the 3rd way of implementing Singleton class.  
 * Bill Pugh Singleton Implementation:
 * A subclass in a class dont get loaded at time of class loading of parent class.
 * It is more extensive version of Eager Initialization mechanism.
 */
public class BillPughDesign{
	
	private BillPughDesign() {
		//
	}
	private static class SingletonIns{
		public static final BillPughDesign singlep=new BillPughDesign();

	}
	
	static BillPughDesign getInstance() {
		return SingletonIns.singlep;
	}
}