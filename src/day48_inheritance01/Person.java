package day48_inheritance01;

public class Person {
	
	String name;
	int age;
	char gender;
	
	public void eat(String food) {
		
		System.out.println(name + " is eating a "+ food);
		
	}
	
	public void walk() {
		System.out.println(name+ " is walking");
	}
	
	public void sleep(int hours) {
		System.out.println(name + " sleeps for "+ hours + " hours");
	}

}
