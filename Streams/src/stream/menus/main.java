package stream.menus;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Dish> menu = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.MEAT),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.MEAT),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH)
				);
		
		
		List<String> threeHighCaloricDishName = menu.stream()
				.filter(d -> d.getCalories() > 300)
				.map(Dish::getName)
				.limit(3)
				.collect(toList());
		
		//System.out.println(threeHighCaloricDishName);
		
		
		List<String> fishNames = menu.stream()
				.filter(d -> {	
								//System.out.println("filtering " + d.getName());
								return d.getType().equals(Dish.Type.FISH);
					 		 })
				.map(d -> {	
							//System.out.println("mapping "+ d.getName());
							return d.getName();
						  })
				.limit(4)
				.collect(toList());
		
		//System.out.println(fishNames);
		
		/*terminal operations*/
		menu.stream().forEach(d -> {System.out.println(d);});
		
		/*return legnths of words*/
		List<String> words = Arrays.asList("hello", "yoursss", "people");
		
		
		List<Integer> lenghts = words.stream()
					  .map(o -> o.length())
					  .collect(toList());
		
		System.out.println(lenghts);
		
		
		
		
	}

}
