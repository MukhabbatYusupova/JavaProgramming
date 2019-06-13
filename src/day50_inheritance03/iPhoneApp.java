package day50_inheritance03;

public class iPhoneApp extends App{
	
	public iPhoneApp() {
		super ("iPhone name - unknown");
		System.out.println("no args");
	}
	
	
	public iPhoneApp(String name) {
		super(name);
		
	}

	private String developer;
	
	

}
