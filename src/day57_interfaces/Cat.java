package day57_interfaces;


public	class Cat implements Pet, Callable{

		@Override
		public void respond() {
			System.out.println("meow meowww");
			
		}

		@Override
		public void keepAsPet() {
			System.out.println("Cat is indoor");
			
		}
		
	}
		


