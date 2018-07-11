package com.wind.s07;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:applicationCTX.xml");
		ctx.refresh();
		
		System.out.println("---");
		
		Student student = ctx.getBean("student", Student.class);
		OtherStudent otherstudent = ctx.getBean("otherstudent", OtherStudent.class);
		
		System.out.println("이름1 : " + student.getName());
		System.out.println("나이1 : " + student.getAge());

		System.out.println("이름2 : " + otherstudent.getName());
		System.out.println("나이2 : " + otherstudent.getAge());

		ctx.close();
	}

}
