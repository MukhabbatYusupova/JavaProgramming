package day57_interfaces;

public class Tesla extends Vehicle implements Electric, Autonomous {

	@Override
	public void charge() {
		System.out.println("Tesla is charging...");
		
	}
	
	public void selfDrive() {
		System.out.println("Tesla is auto mode...");
	}

}
