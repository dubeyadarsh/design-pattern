package com.design.principles.structural.facade;

import lombok.Data;

@Data
class HomeTheaterFacade {
    private TV tv;
    private Speaker soundSystem;
    private Lights lights;
    
    public HomeTheaterFacade(String tvname, String tvSize, String speakerName,Integer speakerVol) {
    	TV tv=new TV(tvname,tvSize);
		Lights lit=new Lights("Home theatre lights");
		Speaker sp=new Speaker(speakerName,speakerVol);
        this.tv = tv;
        this.soundSystem = sp;
        this.lights = lit;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
      
        lights.turnOffLight();
    
        soundSystem.turnOnSpeaker();
        soundSystem.setVolume(10);
        
        tv.turnOnTV();
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        
        lights.turnOnLight();
        
        soundSystem.setVolume(0);
        soundSystem.turnOffSpeaker();
        
        tv.turnOffTv();
    }
}