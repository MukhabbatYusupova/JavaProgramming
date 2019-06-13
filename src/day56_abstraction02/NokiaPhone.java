package day56_abstraction02;

public class NokiaPhone extends MobilePhone{

	@Override
	public void text(String message) {
		System.out.println("Nokia sending msg: " + message);
		
	}

	@Override
	public void call() {
		System.out.println("Nokia is calling...");
		
	}

	
	
	

}
