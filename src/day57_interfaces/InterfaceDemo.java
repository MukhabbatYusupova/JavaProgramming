package day57_interfaces;

public class InterfaceDemo {
	public static void main(String[] args) {
		
		Tesla t = new Tesla();
		
		BMWia b = new BMWia();
		
		t.charge();
		b.charge();
		
		t.selfDrive();
		t.drive();
		
		
		Cat cat = new Cat();
		cat.play();
		cat.keepAsPet();
		// cat.feed doesnt show cuz it is static
		
		Pet.feed("dry food");
		
	}

}
