package day40_customClassesAndMethods;

public class Employee {
	
	public String name; // can be used anywhere in project
	public String jobTitle;
	double salary; // can only be used in same package
	
	public void work() {
		System.out.println(name + " is working hard ...");
	}
	

public void attendMeeting(){
	System.out.println(name + " is attending a meeting");
	
}

public void introduce() {
	System.out.println("Name ["+ name + "], jobTitle ["+ jobTitle+"], salary["+salary+"]");
	
}
}
