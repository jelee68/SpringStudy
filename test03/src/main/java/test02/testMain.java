package test02;

public class testMain {

	public static void main(String[] args) {
		MyCalculator myCalculrator = new MyCalculator();
		
		myCalculrator.setCalculator(new Calculator());
				
		myCalculrator.setFirstNum(10);
		myCalculrator.setSecondNum(2);
		
		myCalculrator.add();
		System.out.println();
		myCalculrator.sub();
		System.out.println();
		myCalculrator.mul();
		System.out.println();
		myCalculrator.div();
	}

}
