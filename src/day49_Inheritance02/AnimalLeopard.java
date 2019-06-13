package day49_Inheritance02;

public class AnimalLeopard extends Animal{
	
	public AnimalLeopard() {
		
		super(); // call aprent class no arg constructor
		System.out.println("Leopard Constructor");
		
		setType("Leopard"); //called setter method
	}
	
	public AnimalLeopard(String type) {
		super(type);
		System.out.println("Leopard one arg constructor");
	}

}
