package day41_customclasses02;

public class myCars {
	
	public static void main(String[] args) {
		
		Cars car1 = new Cars ();
		
		car1.printCarInfo(); // it gives u default values
		
		car1.make = "Honda";
		car1.model = "Civic";
		car1.color = "Brown";
		car1.currentSpeed = 70;
		 
		car1.printCarInfo();
		
		car1.showCurrentSpeed(50);
		car1.showCurrentSpeed(80);
		
		car1.drive();
		
		car1.model=("Accord");
		System.out.println("before: "+ car1.currentSpeed);
		car1.accellerate(20);
		System.out.println("after: "+ car1.currentSpeed);
		
		System.out.println("####### BMW ########");
		
		BMW bmw = new BMW();
		
		System.out.println(bmw.make + " "+ bmw.model);
		
		bmw.model = "m3";
		
		System.out.println(bmw.make + " "+ bmw.model);
		
		bmw.showPrice();
		
        bmw.model = "x3";
        System.out.println(bmw.make + " "+ bmw.model);
		
		bmw.showPrice();
	}

}
