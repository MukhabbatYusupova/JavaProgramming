package day55_abstraction;

public abstract class Vehicle {

	private int wheels;
	private double price;
	private String type;
	private String powerSource;
	
	public Vehicle(int wheels, double price, String type, String powerSource) {
		this.wheels = wheels;
		this.price = price;
		this.type=type;
		this.powerSource = powerSource;
	}
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPowerSource() {
		return powerSource;
	}

	public void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}

	
	public abstract void move();

	
}

class Sailboat extends Vehicle{
	
	private int length;

	public Sailboat( double price) {
		super(0, price,"Sail boat", "wind");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	public int getLength() {
		return length;
	}
	
}


class bike extends Vehicle{

	public bike(int wheels, double price) {
		super(wheels, price, "Bike", "legs");
		
	}

	@Override
	public void move() {
	System.out.println("cycling");
		
	}
	
}
