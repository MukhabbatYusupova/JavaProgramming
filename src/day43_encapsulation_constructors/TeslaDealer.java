package day43_encapsulation_constructors;

public class TeslaDealer {
public static void main(String[] args) {
	
	Tesla car1 = new Tesla();
	
	car1.setModel("Model 3");
	car1.setRange(310);
	car1.setZeroto60(3.2);
	car1.setPrice(51450.0);
	car1.setSelfDriving(true);
	
	System.out.println("Model: "+car1.getModel());
	System.out.println("Range: "+ car1.getRange());
	System.out.println("0-60: "+ car1.getZeroto60());
	System.out.println("Price: "+ car1.getPrice());
	System.out.println("Automated: "+ car1.isSelfDriving());
	
	System.out.println(car1);
	System.out.println(car1.toString());
	
	
	Tesla car2 = new Tesla();
	
	car2.setTeslaInfo("Roadster", 620, 1.9, 2500000, true);
	System.out.println(car2.toString());
	
	
	if (car1.getZeroto60()> car2.getZeroto60()) {
		System.out.println(car2.getModel()+ " is faster!");
	} else {
		System.out.println(car1.getModel()+ " is faster!");
	}
	
	buy(car2);
	buy(car1);
	
	System.out.println(testDrive("Model s"));
	
	
	
	
} //end of  main method
	public static void buy(Tesla car) {
		
		System.out.println("Purchasing "+ car.toString());
	}
	
	public static Tesla testDrive(String model) {
		
		System.out.println("I would like to test drive - "+ model);
		System.out.println("Sure, let me build the object abd return it");
		Tesla newCar = new Tesla();
		newCar.setTeslaInfo(model, 310, 2.5, 95000, false);
		
		return newCar;
	}
	
}
