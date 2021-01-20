package com.spring.first;

public class Factory {
	public static Tv makeTv(String tvName) {
		switch(tvName) {
		case "Lg":
			return new LgTV();
		case "Samsung":
			return new SamsungTV(100, 30);
		case "Apple":
			return new AppleTV(300, 100);
		}
		return null;
	}
	
	public static Speakerable makeSpeaker(String speakerName) {
		switch(speakerName) {
		case "Boss":
			return new BossSpeaker();
		case "Haman":
			return new HamanSpeaker();
		}
		return null;
	}
}
