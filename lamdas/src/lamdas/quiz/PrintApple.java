package lamdas.quiz;

import java.util.List;
import lamdas.Apple;

public class PrintApple {

	public static void prettyPrintApple(List<Apple> inventory, 
			PrintApplePredicate predicate) {
		
		for (Apple apple : inventory) {
			
			String output = predicate.prettyPrint(apple);
			System.out.println(output);
		}
		
	}
}
