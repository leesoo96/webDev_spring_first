package com.spring.first;

public class Tv {
	
	private Speakerable speaker;
	private int maxChannel;
	private int currentChannel;
	private int maxVolume;
	private int currentVolume;
		
	public Tv(int maxChannel, int maxVolume) {
		super();
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}
	
	public void setSpeaker(Speakerable speaker) {
		this.speaker = speaker;
	}
	
	public void volumeUp() {
		if(maxVolume > currentVolume) {
			currentVolume++;
		}
		speaker.speakUp();
	}
	
	public void volumeDown() {
		if(currentVolume > 0) {
			currentVolume--;
		}
		speaker.speakDown();
	}
	
	@Override
	public String toString() {
		return String.format("currentChannel : %d, currentVolume: %d"
				, currentChannel, currentVolume);
	}
}





















