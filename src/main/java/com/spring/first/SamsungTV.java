package com.spring.first;

public class SamsungTV extends Tv {
	
	public SamsungTV() {
		super(10, 10);
	}
	
	public SamsungTV(int maxChannel, int maxVolume) {
		super(maxChannel, maxVolume);
		System.out.println("maxChannel = " + maxChannel);
		System.out.println("maxVolume = " + maxVolume);
	}
	
	@Override
	public String toString() {
		return "SamsungTV : " + super.toString();
	}
}
