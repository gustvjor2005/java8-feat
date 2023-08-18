package lamdas;

public class Apple {
	
	int id;
	String color;
	float weight;
	
	public Apple(int id, String color, float weight) {
		
		this.id = id;
		this.color = color;
		this.weight = weight;
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}
		
}
