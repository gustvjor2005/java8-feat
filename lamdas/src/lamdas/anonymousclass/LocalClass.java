package lamdas.anonymousclass;

public class LocalClass {
	/*Anonymous class are like local class, also
	 *they allow to declare and instantiate a class*/
	public static void main(String[] args) {
		
		
		System.out.println("Local Class \n");
		
		
		class Radio {
			
			int id;
			String name;
			
			
			public Radio(int id, String name) {
				this.id = id;
				this.name = name;
			}
			
		}
		
		Radio radioNacional = new Radio(1, "Perú Avanza");
		
		System.out.printf("This is National Radio : %1$s", radioNacional.name);
		
	}
	
	
}
