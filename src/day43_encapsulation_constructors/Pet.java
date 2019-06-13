package day43_encapsulation_constructors;

public class Pet {
	
	private String type;
	private String name;
	
	public Pet(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public Pet() {
		System.out.println("No args constructer");
	}
	
	public void speak() {
		switch(type.toLowerCase()) {
		case "cat":
			System.out.println("meow");
			break;
		case "dog":
			System.out.println("woof woof");
			break;
		case "goat":
			System.out.println("mheeee");
			break;
		case "sheep":
			System.out.println("bhaaa bhaaaa");
			break;
		case "rooster":
			System.out.println("u uruuuu uuuuu");
			break;
		default: 
			System.out.println("...");
		}
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}
	
	
	

}
