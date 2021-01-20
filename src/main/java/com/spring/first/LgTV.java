package com.spring.first;

import org.springframework.stereotype.Component;

//Component -> 사용할 객체를 정할 때 사용 
@Component("tv") // 빈 등록 
public class LgTV extends Tv {
	
	public LgTV() {
		super(10, 20);
		System.out.println("--- LgTv created 기본 생성자");
	}
	
	public LgTV(int maxChannel, int maxVolume) {
		super(maxChannel, maxVolume);
		System.out.println("--- LgTv created overrided 생성자");
	}
	
	@Override
	public String toString() {
		return "LgTV : " + super.toString();
	}
}
