package com.wind.sp04;

import java.util.ArrayList;

public class MyInfo {

	private String name;
	private double heigth;
	private double weigth;
	private ArrayList<String> hobbies;
	private BmiCalculator bmiCalculator;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	public void setBmiCalculator(BmiCalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	
	public void bmiCalculator() {
		bmiCalculator.bmi_calculator(weigth, heigth);
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + heigth);
		System.out.println("몸무게 : " + weigth);
		System.out.println("취미 : " + hobbies);
		
		bmiCalculator();
	}
}

