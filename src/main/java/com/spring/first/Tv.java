package com.spring.first;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;

public class Tv {
	
	// 빈 등록으로 한 것 중 Speakerable 타입이 가리킬 수 있는 객체를 자동으로 주입한다
	@Autowired
//	@Qualifier("boss") // BossSpeaker 객체를 사용하겠다는 의미  
//	@Resource => @Autowired + @Qualifier
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





















