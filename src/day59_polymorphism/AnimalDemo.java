package day59_polymorphism;

public class AnimalDemo {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		// Polymorphysm
		Animal tiger = new Tiger();
		Animal someanimal =  new Zebra();
		Animal cheetah = new Cheetah();
		
		animal.talk();
		tiger.talk();
		someanimal.talk();
		cheetah.talk();
		
		Animal [] animals = new Animal[3];
		animals[0]= new Tiger();
		animals[1]= new Cheetah();
		animals[2]= new Zebra();
		
		animals[0].talk();
		animals[1].talk();
		animals[2].talk();
		
		
		
		
	}

}
