package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		int count = 1;
		List<Dish> menu = new ArrayList<>();
		for (String arg:args) {
			
			
			String[] arr = arg.split(":");
			System.out.printf("args %1$s %2$s \n" , arr[0], arr[1]);
			Dish dish = new Dish(count, arr[0], Float.parseFloat(arr[1]));
			menu.add(dish);
			count +=1;
		}
		
		/*ordering menu*/
		
		Collections.sort(menu, new Comparator<Dish>() {

			@Override
			public int compare(Dish d1, Dish d2) {
				// TODO Auto-generated method stub
				return Float.compare(d1.getCalories(), d2.getCalories());
			}
			
		});
		
		for(Dish dish: menu) {
			System.out.printf("the dish %1$s has %2$f \n", dish.getName(), dish.getCalories());
		}
		
		/*ordering desc by lambdas*/
		
		Collections.sort(menu, (Dish d1, Dish d2) -> 
									Float.compare(d2.getCalories(), d1.getCalories())
						);
		
		System.out.println("descending");
		for(Dish dish: menu) {
			System.out.printf("the dish %1$s has %2$f \n", dish.getName(), dish.getCalories());
		}
		
		/*ordering Strings*/
		
		List<String> strings = new ArrayList<>();
		strings.add("abc");
		strings.add("zbc");
		strings.add("bbc");
		
		Collections.sort(strings);
		
		for (String s: strings) {
			System.out.printf("str %1$s \n", s);
		}
		
	}
}
