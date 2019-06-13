package day49_Inheritance02_2;
import day49_Inheritance02.Device;
public class DeviceDemo3 extends Device { // subclass (child class) from different package

	public void readEBook(String title) {
		System.out.println("Reading a book "+ title + " using " + brand + " tablet");
	}
	
	
	public static void main(String[] args) {
		
	}
}
