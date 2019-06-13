package day59_polymorphism;

public abstract class Inventory {
	
	private String name;
	public String department;
	
	public abstract void placeInDep();
	
	public void setName(String name) {
		this.name=name;
	}
	
    public String getName() {
	  return name;
    }
}
