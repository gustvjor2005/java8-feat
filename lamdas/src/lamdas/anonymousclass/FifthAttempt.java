package lamdas.anonymousclass;

import java.util.ArrayList;
import java.util.List;
import lamdas.Apple;
import lamdas.ApplePredicate;

public class FifthAttempt {
	
	
	public static List<Apple> filterApple(List<Apple> inventory, 
			ApplePredicate predicate) {
		
		List<Apple> filterApples = new ArrayList<>();
		for (Apple apple: inventory) {
			
			if(predicate.test(apple)) {
				
				filterApples.add(apple);
			}
		}		
		
		return filterApples;
	}
}
