package com.spring.first;

public class AppleTV extends Tv {

	public AppleTV(int maxChannel, int maxVolume) {
		super(maxChannel, maxVolume);		
	}
	
	@Override
	public String toString() {
		return "AppleTV : " + super.toString();
	}
}
