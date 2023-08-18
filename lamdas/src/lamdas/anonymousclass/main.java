package lamdas.anonymousclass;

import java.util.ArrayList;
import java.util.List;

import lamdas.Apple;
import lamdas.ApplePredicate;

public class main {

	
	public static void main(String[] args) {
		
		int count=1;
		List<Apple> inventory = new ArrayList<>();
		for (String arg:args) {
			
			Apple apple = new Apple(count, arg, 120);
			count +=1;
			inventory.add(apple);
		}
		
		/**Using anonymous class for red and weight apples**/
		List<Apple> redApples = new ArrayList<>();
		redApples = FifthAttempt.filterApple(inventory, new ApplePredicate() {
			
			@Override
			public boolean test(Apple apple) {
				// TODO Auto-generated method stub
				return "red".equals(apple.getColor());
			}
		});
		
		System.out.printf("number of red apples is %1$d \n", redApples.size());
		
		/**Using lambdas**/
		List<Apple> pinkApples = new ArrayList<>();
		pinkApples = FifthAttempt.filterApple(inventory, 
				(Apple apple) -> "pink".equals(apple.getColor()));
		
		System.out.printf("number of pink apples is %1$d", pinkApples.size());
	}
}
