package vehicleDealership;

public class Motorcycle extends Vehicle {
	
	private  String displacement;

	public Motorcycle(String brand, String model, String displacement) {
		super(brand, model);
		this.displacement = displacement;
		
	}

	public String getDisplacement() {
		return displacement;
	}

	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	
	
}
