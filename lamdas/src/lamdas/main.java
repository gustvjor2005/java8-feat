package lamdas;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Apple> inventory = new ArrayList<>();
		int count = 1;
		for (String appleColor:args) {
			Apple a = new Apple(count, appleColor, 100);
			count +=1;
			inventory.add(a);
		}
		
		List<Apple> greenApples = new ArrayList<>();
		/*First Attempt, filter only for green apples*/
		greenApples = FirstAttempt.filterGreenApples(inventory);
		System.out.printf("green apples in the inventory %1$d \n", greenApples.size());
		
		/*Second Attempt, filter by color*/
		List<Apple> blueApples = new ArrayList<>();
		blueApples = SecondAttempt.filterApplesByColor(inventory, "blue");
		greenApples = SecondAttempt.filterApplesByColor(inventory, "green");
		
		System.out.printf("blue apples in the inventory %1$d \n", blueApples.size());
		System.out.printf("green apples in the inventory %1$d \n", greenApples.size());
		
		/*Fourth Attempt, filter using strategy pattern*/
		List<Apple> weightApples = new ArrayList<>();
		ApplePredicate predicateByHeavyWeight = new AppleHeavyWeightPredicate();
		weightApples = FourthAttempt.filterApples(inventory, predicateByHeavyWeight);
		System.out.printf("weight apples in the inventory %1$d \n", weightApples.size());
		
		
		
	}
}
