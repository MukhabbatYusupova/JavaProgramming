package day49_Inheritance02;

public class DeviceDemo {
	
	public static void main(String[] args) {
		
	
	Device dv = new Device();
	
	dv.brand = "LG";  // public device
	dv.model = "3300"; // protected 
	dv.price = 100.0; //default
	// dv.country = "USA"  <= private not working
	
 }
}
