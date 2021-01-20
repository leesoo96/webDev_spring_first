package com.spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tvtest2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application2.xml");

		// LgTv
		Tv tv = (Tv)ctx.getBean("tv");
		
		tv.volumeUp();
		System.out.println(tv);
	}
}
