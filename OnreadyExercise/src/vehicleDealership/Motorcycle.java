package vehicleDealership;

public class Motorcycle extends Vehicle {
	
	private  int displacement;

	public Motorcycle(String brand, String model, double price, int displacement) {
		super(brand, model, price);
		this.displacement = displacement;
		
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	@Override
	public String toString() {
		String s = "Marca: " + this.getBrand() + " // " + 
				   "Modelo: " + this.getModel() + " // " + 
				   "Cilindrada: " + this.getDisplacement() + "cc // " +
				   "Precio : " + this.formatPrice(this.getPrice())+ "\n";
		return s;
	}
	
	
}
