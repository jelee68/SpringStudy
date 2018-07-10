package com.wind.s06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//XML파일을 이용한 방법
		//String configLocation = "classpath:applicationCTX.xml";
		//AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		//JAVA파일을 이용한 방법
		AnnotationConfigApplicationContext	ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Family family = ctx.getBean("family", Family.class);
		ctx.close();
		
		System.out.println(family.getFatherName());
		System.out.println(family.getMotherName());
		System.out.println(family.getBrotherName());
	}

}
