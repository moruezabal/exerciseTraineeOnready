package vehicleDealership;

import java.text.DecimalFormat;

public abstract class Vehicle {
	
	private String brand;
	private String model;
	private double price;
	
	public Vehicle (String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String formatPrice(double price) {
		String s = "$";
		DecimalFormat pattern = new DecimalFormat("###,###.00");
		s += pattern.format(price);
		return s;
	}
	
	public String getName() {
		return this.brand + " " + this.model;
	}

	public abstract String toString();
	
	
	
	

}
