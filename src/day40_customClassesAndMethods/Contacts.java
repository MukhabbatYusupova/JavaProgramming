package day40_customClassesAndMethods;

public class Contacts {

	String name;
	String phoneNumber;
	String email;
	
	public void call() {
		System.out.println("Calling to "+ name+ "...");
	}
	
	public void sendMessage() {
		System.out.println("Sending message to " + phoneNumber);
	}
	
	public void sendEmail () {
		System.out.println("Sending email to " + email);
	}
}
