package day48_inheritance01;

public class Student extends Person {
	
	int studentID;
	String clasS;
	
	public void code (String lang) {
		System.out.println(name+ " is coding "+ lang);
	}
	
	public void attendClass() {
		System.out.println(name + " is attending "+ clasS+ " class");
	}
	
	
	

}
