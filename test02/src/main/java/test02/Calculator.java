package test02;

public class Calculator {
	private int firstNum;
	private int secondNum;
	
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void addition() {
		System.out.println("addition");
		int result = firstNum + secondNum;
		System.out.println(firstNum + " + " + secondNum + " = " + result);	
	}
	public void subtraction() {
		System.out.println("subtraction");
		int result = firstNum - secondNum;
		System.out.println(firstNum + " - " + secondNum + " = " + result);	
	}	
	public void mutipulication() {
		System.out.println("mutipulication");
		int result = firstNum * secondNum;
		System.out.println(firstNum + " * " + secondNum + " = " + result);	
	}	
	public void division() {
		System.out.println("division");
		int result = firstNum / secondNum;
		System.out.println(firstNum + " / " + secondNum + " = " + result);	
	}	
	
}
