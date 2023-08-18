package lamdas.quiz;

import java.util.ArrayList;
import java.util.List;

import lamdas.Apple;

public class main {

	public static void main(String[] args) {
		
		int count=1;
		List<Apple> inventory = new ArrayList<>();
		for (String arg: args) {
			
			Apple apple = new Apple(count, arg, 100);
			count +=1;
			inventory.add(apple);
		}
		
		/**Pretty print apple weight**/
		PrintApplePredicate weightPredicate = new PrintAppleWeightPredicate();
		PrintApple.prettyPrintApple(inventory, weightPredicate);
		/**Pretty print apple color**/
		PrintApplePredicate colorPredicate = new PrintAppleColorPredicate();
		PrintApple.prettyPrintApple(inventory, colorPredicate);
	}
}
