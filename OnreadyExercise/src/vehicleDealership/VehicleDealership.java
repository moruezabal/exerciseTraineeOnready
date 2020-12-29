package vehicleDealership;

import java.util.ArrayList;

public class VehicleDealership {
	
	private ArrayList<Vehicle> vehicles;

	public VehicleDealership(){
		this.vehicles = new ArrayList<Vehicle>();
	}

	public ArrayList<Vehicle> getVehicles() {
		return new ArrayList<>(vehicles);
	}
	
	public void addVehicle(Vehicle newVehicle) {
		this.vehicles.add(newVehicle);
		
	}
	
	public String showVehicles() {
		String list = "";
		for (Vehicle vehicle: this.vehicles) {
			list += vehicle.toString();
		}
		
		return list;
	}
	
	
}
