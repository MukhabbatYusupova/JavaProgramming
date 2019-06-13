package day55_abstraction;

public class AnimalZoo {
	
	public static void main(String[] args) {
		
	//	Animal animal1 = new Animal();  Cannot instantiate type abstract class
		
		AnimalCat fluffy = new AnimalCat("Fluffy");
		fluffy.setName("Fluffy");
		fluffy.speak();
		fluffy.eat();
		
		
		Dog droopy = new Dog("Droopy");
		droopy.setName("Droopy");
		droopy.speak();
		droopy.eat();
		
		
	}

}


