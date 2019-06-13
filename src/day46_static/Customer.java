package day46_static;

public class Customer {
	
	private String name;
	private String email;
	static int count; //shared 
	
		public Customer() {
		name ="undefined";
		email ="undefined";
		count++;
		
	
	}
	
	public Customer(String name, String email) {
		this.name =name;   // same thing
		setEmail(email);  // when u have conditions inside the setter we must use 
		count++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	

}
