package vehicleDealership;

public class Main {

	public static void main(String[] args) {
		
		VehicleDealership vd = new VehicleDealership();
		
		Vehicle c1 = new Car("Peugeot", "206", 200000.00, 4);
		Vehicle m1 = new Motorcycle("Honda", "Titan", 60000.00, 125);
		Vehicle c2 = new Car("Peugeot", "208", 250000.00, 5);
		Vehicle m2 = new Motorcycle("Yamaha", "YBR", 80500.50, 160);
		
		vd.addVehicle(c1);
		vd.addVehicle(m1);
		vd.addVehicle(c2);
		vd.addVehicle(m2);
		
		System.out.println(vd.showVehicles());

	}

}
