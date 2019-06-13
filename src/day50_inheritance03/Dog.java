package day50_inheritance03;

public class Dog extends Animal {
	@Override   // <== annotation
	public void speak() {
		System.out.println("Dog is sayin woof woof-woof");
	}
	public void move(int steps) {
		System.out.println("Dog is moving "+ steps + " steps");
	}
}
