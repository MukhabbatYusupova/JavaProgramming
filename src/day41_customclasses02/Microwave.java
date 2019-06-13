package day41_customclasses02;

public class Microwave {
	
	String brand;
	boolean isOn;
	
	public void turnOn() {
		if (isOn) {
			System.out.println( brand + " microwave is already on!");
		} else {
			System.out.println("Turning on the " + brand+ " microwave...");
		isOn = true;
		}
		
	}
	
	public void turnOff() {
		if (!isOn) { // false it is already off
			System.out.println("It is already off!");
		}else {
			System.out.println("turning off the " + brand+ " microwave...");
			
			isOn=false;
		}
		
	}
	
	public void heat (String food) {
		if (isOn) {
			System.out.println("Heating "+ food);
		} else {
			System.out.println("Microwave is off.");
		}
		
	}

}
