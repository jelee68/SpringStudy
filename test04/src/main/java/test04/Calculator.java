package test04;

public class Calculator {
	public void addition(int firstNum, int secondNum) {
		System.out.println("addition");
		int result = firstNum + secondNum;
		System.out.println(firstNum + " + " + secondNum + " = " + result);	
	}
	public void subtraction(int firstNum, int secondNum) {
		System.out.println("subtraction");
		int result = firstNum - secondNum;
		System.out.println(firstNum + " - " + secondNum + " = " + result);	
	}	
	public void mutipulication(int firstNum, int secondNum) {
		System.out.println("mutipulication");
		int result = firstNum * secondNum;
		System.out.println(firstNum + " * " + secondNum + " = " + result);	
	}	
	public void division (int firstNum, int secondNum) {
		System.out.println("division");
		int result = firstNum / secondNum;
		System.out.println(firstNum + " / " + secondNum + " = " + result);	
	}	
}
