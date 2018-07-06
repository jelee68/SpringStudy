package test04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class testMain {

	public static void main(String[] args) {

		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx =  new GenericXmlApplicationContext(configLocation);
		
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		
		ctx.close();
		
		myCalculator.add();
		System.out.println();
		myCalculator.sub();
		System.out.println();
		myCalculator.mul();
		System.out.println();
		myCalculator.div();
	}

}
