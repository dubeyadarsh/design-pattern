package com.design.principles.structural.facade;

/**
 * The Facade Pattern provides a simplified interface to a complex subsystem,
   making it easier for the client to interact with the system.
   For example : To watch a movie in a theatre it takes bunch of process to complete before movie starts like
  Turn On the speaker,Turn On the tv,Turn On the Projector etc. 
   So facade provides simplified way to watch a movie without thinking about other parts.
 */
public class FacadeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HomeTheaterFacade hm=new HomeTheaterFacade("SONY", "65INCH" ,"BOAT",5);
		hm.watchMovie("DEADPOOL");
		hm.getSoundSystem().setVolume(10);
		
	}

}
