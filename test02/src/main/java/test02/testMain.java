package test02;

public class testMain {

	public static void main(String[] args) {
		Calculator calculrator = new Calculator();
		
		calculrator.setFirstNum(10);
		calculrator.setSecondNum(2);
		
		calculrator.addition();
		System.out.println();
		calculrator.subtraction();
		System.out.println();
		calculrator.mutipulication();
		System.out.println();
		calculrator.division();
	}

}
