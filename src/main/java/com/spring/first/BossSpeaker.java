package com.spring.first;

//import org.springframework.stereotype.Component;

//@Component("boss")
public class BossSpeaker implements Speakerable {
	
	private int currentSpeakerPower;
	
	public BossSpeaker() {
		System.out.println("-- BossSpeaker Created ");
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
