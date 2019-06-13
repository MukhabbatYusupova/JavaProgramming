package day45_practice_Encapsulation;
import java.util.*;
public class EtsyAccount {
	
	
	private String email;
	private String firstName;
	private String password;
	
	//contructor 1 No-args.
	
	public EtsyAccount() {
		email     ="";
		firstName ="";
		password  ="";
	}
	
	// constructor 2
	public EtsyAccount(String email, String firstName, String password) {
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
		}
	
	// constructor 3
	
	public EtsyAccount (String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password = getRandomPassword();
	}
	

	
	
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
	
		if (email.indexOf("@")>0 && email.indexOf("@")<email.length()-1) {
			this.email = email;
		} else {
			System.out.println("Please enter the valid email!");
			this.email="Invalid email";
		}
		
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		
		if(isVAlidFirstName(firstName)) {
			this.firstName = firstName;
		} else {
			System.out.println("Your first name contains invalid character!");
			this.firstName ="Invalid Name";
		}
		
		
	}
	private boolean isVAlidFirstName(String firstName) {
		//check first if it starts with or ends with space if so return false
		if (firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}
		if (firstName.isEmpty()) {
			System.out.println("Cannot be blank!");
			return false;
		}
		
		for (int i = 0; i<firstName.length(); i++) {
			char ch = firstName.charAt(i);
			if (!Character.isAlphabetic(ch) && ch!=' ') {
				return false;
			}
			
		}
		       return true;
	}
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		
		if (password.length()>=6) {
			
		this.password = password;
		} else {
			System.out.println("Password should be at least 6 characters!");
			this.password = "Invalid PassWord!";
		}
		
	}
	
	
	private String getRandomPassword() {
		Random rd = new Random();
		String abc = "abcdefghijklmnopqrstuvwxyz0123456789";
		String rdPassword="";
		
		for (int i=1; i<=6; i++) {
			rdPassword+= abc.charAt(rd.nextInt(abc.length()));
		}
		return rdPassword;
	}
	
	@Override
	public String toString() {
		return "EtsyAccount email: " + email + ", firstName: " + firstName.toLowerCase() + ", password: " + password;
	}
	
	

}
