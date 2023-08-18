package lamdas.anonymousclass;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lamdas.Apple;

/*args: "pink:100" "blue:120" "yellow:20" */
public class OthersCases {

	/*Comparators*/
	
	public static void main(String[] args) {
		
		int count = 1;
		List<Apple> inventory = new ArrayList<>();
		for (String arg: args) {
			
			
			String[] arr_args = arg.split(":");
			Apple apple = new Apple(count, arr_args[0], Integer.parseInt(arr_args[1]));
			count +=1;
			inventory.add(apple);
			
		}
		/**/
		inventory.sort(new Comparator<Apple>() {
			public int compare(Apple a1, Apple a2) {
				BigDecimal a1Weight = new BigDecimal(a1.getWeight());
				BigDecimal a2Weight = new BigDecimal(a2.getWeight());
				return a1Weight.compareTo(a2Weight);
			}
		});
		
		for (Apple apple: inventory) {
			System.out.printf("Apple %1$d %2$s %3$f \n",
					apple.getId(), apple.getColor(), apple.getWeight());
		}
	}
}
