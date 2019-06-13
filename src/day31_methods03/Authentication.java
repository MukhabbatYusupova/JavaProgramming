package day31_methods03;

public class Authentication {
	
public static void main(String[] args) {
	
	
	login("mentoring@cybertekschool.com", "mentor01");
	
}	
	
public static void login(String username, String password) {
	String validUsername = "mentoring@cybertekschool.com";
	String validPassword = "mentor01";
	
	if (username.contentEquals("mentoring@cybertekschool.com")&& password.contentEquals("mentor01")) {
		System.out.println("Log in successful!");
		} else {
			System.out.println("Failed!");
		}
//String result=(username.contentEquals(validUsername)) ? (password.contentEquals(validPassword))? "Successfull" : "Failed":"Default"; 
	
}	
	
	
	
	

}
