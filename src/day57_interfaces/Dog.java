package day57_interfaces;

public class Dog implements Pet, Callable {

	@Override
	public void respond() {
	System.out.println("Dog is reponding woof-woof");
		
	}

	@Override
	public void keepAsPet() {
		System.out.println("Dog can be indoor and outdoor");
		
	}

}

class Fish implements Pet{

	@Override
	public void keepAsPet() {
		System.out.println("Fish is in fish tank with water");
		
	}
	

}
