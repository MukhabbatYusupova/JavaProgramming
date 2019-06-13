package day42_customClasses_encapsulation;

public class Person {
	
	 private String name;
	private int age;
	
	//public getter and setter for name
	// read only
	
	
	
	public String getName() {  //get+variable name in uppercase getSize, getName
		return name;
	}
	//write only
	
	public void setName(String name) {
		this.name = name; // this. refers to instance variable name
	}

}
