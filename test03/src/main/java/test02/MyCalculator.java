package test02;

public class MyCalculator {
	
	Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public MyCalculator() {
		
	}

	public void add() {
		calculator.addition(firstNum,secondNum);
	}
	public void sub() {
		calculator.subtraction(firstNum,secondNum);
	}
	public void mul() {
		calculator.mutipulication(firstNum,secondNum);
	}
	public void div() {
		calculator.division(firstNum,secondNum);
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}


}