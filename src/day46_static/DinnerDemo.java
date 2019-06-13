package day46_static;

public class DinnerDemo {
	public static void main(String[] args) {
	
	Dinner Mom = new Dinner();
	Dinner kid = new Dinner();
	Dinner Dad = new Dinner();	
	
	System.out.println("Slices available: "+ Dinner.pizzaSlices);
	
	
	Dad.takeASlice();
	kid.takeASlice();
	Mom.takeASlice();
	
	System.out.println("Slices available: "+ Dinner.pizzaSlices);  //5
	
	System.out.println("Slices available: "+ Dad.pizzaSlices); //5
	
	kid.takeASlice(3);
	Dad.takeASlice(2);
	//Mom.takeASlice();
	System.out.println("Slices available: "+ Dinner.pizzaSlices); 
	
	
	
	}
	
	
	

}
