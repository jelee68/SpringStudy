package com.wind.sp04;

public class BmiCalculator {

	private double low_weigth;
	private double normal;
	private double over_weigth;
	private double obesity;
	
	public double getLow_weigth() {
		return low_weigth;
	}
	public void setLow_weigth(double low_weigth) {
		this.low_weigth = low_weigth;
	}
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getOver_weigth() {
		return over_weigth;
	}
	public void setOver_weigth(double over_weigth) {
		this.over_weigth = over_weigth;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	public void bmi_calculator(double weigth, double heigth) {

		double h = heigth * 0.01;
		double result = weigth / (h*h);
		
		System.out.println("BMI 지수 : " + (int)result);
		
		if(result > obesity) {
			System.out.println("비만...10일 금식 ");
		}
		else if(result > over_weigth) {
			System.out.println("과체중... 주의 , 3일금식  ");
		}
		else if(result > normal) {
			System.out.println("정상 ... ");
		}
		else{
			System.out.println("저체중 ");
		}
	}
}
