package vehicleDealership;

public class Car extends Vehicle {
	
	private int doors;

	public Car(String brand, String model, int doors) {
		super(brand, model);
		this.doors = doors;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	
	
	

}
