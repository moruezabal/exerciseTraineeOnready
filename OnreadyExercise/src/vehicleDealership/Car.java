package vehicleDealership;

public class Car extends Vehicle {
	
	private int doors;

	public Car(String brand, String model, double price, int doors) {
		super(brand, model, price);
		this.doors = doors;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public String toString() {
		String s = "Marca: " + this.getBrand() + " // " + 
				   "Modelo: " + this.getModel() + " // " + 
				   "Puertas: " + this.getDoors() + " // " +
				   "Precio : " + this.formatPrice(this.getPrice())+ "\n";
		return s;
	}
}