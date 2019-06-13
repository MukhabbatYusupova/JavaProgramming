package day55_abstraction;

public abstract class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public abstract void speak(); // so we cannot have abstract method in regular classes
	public abstract void eat();
	
	
	// instance method
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}

//sub class 

abstract class Mammal extends Animal{
	public Mammal(String name) {
		super(name);
		
	}

	public abstract void feedMilk();
	
	
	
	
}