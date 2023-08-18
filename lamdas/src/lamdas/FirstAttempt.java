package lamdas;

import java.util.ArrayList;
import java.util.List;

public class FirstAttempt {
	
	public static List<Apple> filterGreenApples(List<Apple> inventory){
		
		List<Apple> geenApples = new ArrayList<>();
		for (Apple a: inventory) {
			
			if ("green".equals(a.getColor())) {
				geenApples.add(a);
			}
			
		}	
		
		return geenApples;
		
	}
}
