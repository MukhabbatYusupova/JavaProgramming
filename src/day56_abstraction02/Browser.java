package day56_abstraction02;

public abstract class Browser {
	
	String name;
	static int id; //<= we can call it using class name without creating an obj
	
	//Constructor
	public Browser() {
		System.out.println("Creating a Browser, but we can not use it directly, "
				+ "cuz we can not create an object from abstract class, "
				+ "but we can use in subclasses using super keyword");
	}
	
	public Browser(String name, int id) {
		this.name=name;
		this.id = id;
	}
	
	//Abstract methods
	
	public abstract void navigate(String url);
	public abstract void displayWebpage();
	public abstract boolean launch();
	
	//Regular method
	public void close() {
		System.out.println("Exiting the Browser...");
	}

}
