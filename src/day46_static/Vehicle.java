package day46_static;

public class Vehicle {
	
	String type;   //instance varieble, every object has its own type
	static int numberOfVehicles; // static/shared one central value
	
	public static void vehicleInfo() {
		//System.out.println(type); <= not work instance var can not be inside static method 
	
	System.out.println("Number of Vehicle: "+ numberOfVehicles);
	int count = getNumberOfVehicle();
	String make = "Kia"; // local varieble, do not be need to be static
	make = make.toLowerCase();	}
	
	public static int getNumberOfVehicle() {
		return numberOfVehicles;
	}
	
	public String toString() {
		return "Vehicle type: " + type + " | count: "+ numberOfVehicles;
	}
	
}
