package lamdas;

import java.util.ArrayList;
import java.util.List;

public class SecondAttempt {

	public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
		
		List<Apple> filterApples = new ArrayList<>();
		
		for (Apple apple: inventory) {
			
			if(color.equals(apple.getColor())) {
				filterApples.add(apple);
			}
		}
				
		return filterApples;
	}
}
