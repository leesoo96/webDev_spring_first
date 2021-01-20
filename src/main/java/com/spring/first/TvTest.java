package com.spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvTest {
	
	public static void main(String[] args) {		
		
//		스프링 객체 생성
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
//		빈즈에 등록된 클래스의 기본 생성자가 자동으로 호출된다 
		Speakerable boss = (Speakerable) ctx.getBean("speaker");
		System.out.println("boss = " + boss + "\n");
/*		
  		=> 빈즈에 scope="prototype" 를 주면 다른 주소값을 준다
		Speakerable bs2 = (Speakerable) ctx.getBean("speaker");
		System.out.println("2." + bs2); 
*/		
		
		Tv tv = (Tv) ctx.getBean("tv");
		
		tv.volumeUp();
		System.out.println("tv = " + tv);
	}
}
