package day50_inheritance03;

public class AnimalDemo {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Cat cat = new Cat ();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		animal.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		System.out.println();
		
		animal.move(3);
		cat.move(5);   // if i remove the method in cat it goes to animal and prnts animal moving 5
		dog.move(10);
		duck.move(20);
		
	}

}
