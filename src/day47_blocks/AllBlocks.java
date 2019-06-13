package day47_blocks;

public class AllBlocks {
	int nonStaticInt=10;
	static int staticInt=10;
	
	static {
		System.out.println("1- STATIC block runs first and only ONE_TIME!");
		staticInt--;
	}
	{
		System.out.println("2- Initilizer block runs after static block but before the constructor");
		System.out.println("init block runs each time new object created!");
		staticInt+=5;
		nonStaticInt+=5;
	}
	
	public AllBlocks(){
		System.out.println("3- Constructor runs after the init block, each time u create new obj");
		staticInt+=3;
		nonStaticInt+=3;
	}

}
