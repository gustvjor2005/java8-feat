package lamdas;

import java.util.ArrayList;
import java.util.List;

public class FourthAttempt {

	public static List<Apple> filterApples(List<Apple> inventory, 
			ApplePredicate predicate){
		
		List<Apple> filterApples = new ArrayList<>();
		for (Apple apple: inventory) {
			
			if (predicate.test(apple)) {
				
				filterApples.add(apple);
			}
			
		}
		return filterApples;
	}
}
