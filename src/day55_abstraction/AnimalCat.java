package day55_abstraction;

public class AnimalCat extends Animal {
	
	public AnimalCat(String name) {
		super(name);
	
	}
	@Override
	public void speak() {
		System.out.println("meow meow");
		
	}
	public void eat() {
		System.out.println(getName()+" eats kit-kat");
	}

}
class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void speak() {
		System.out.println("woof woof");
		
	}
	
	public void eat() {
		System.out.println(getName()+ " eats bones");
	}
	
}
