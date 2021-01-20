package com.spring.first;

//import org.springframework.stereotype.Component;

//@Component("haman")
public class HamanSpeaker implements Speakerable {
	
	private int currentSpeakerPower;
	
	public HamanSpeaker() {
		System.out.println("-- HamanSpeaker Created ");
	}
	
	@Override
	public void speakUp() {
		currentSpeakerPower++;
	}

	@Override
	public void speakDown() {
		currentSpeakerPower--;
	}
}
