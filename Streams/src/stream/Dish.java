package stream;

public class Dish {

	int id;
	String name;
	float calories;
	
	public Dish(int id, String name, float calories) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getCalories() {
		return calories;
	}
	
	public void setCalories(float calories) {
		this.calories = calories;
	}
	
}