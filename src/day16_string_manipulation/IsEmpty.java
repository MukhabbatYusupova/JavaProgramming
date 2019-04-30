package day16_string_manipulation;

public class IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userName = "", password = "";
		System.out.println(userName.isEmpty());

		if (userName.isEmpty()) {
			System.out.println("Username field cannot be empty");
		} else {
			System.out.println("Username is not empty");
		}
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password can not be empty");
		} else {
			System.out.println("Username is not empty");
		}

		if(userName.length()==0) {// same purpose with isEmpty
		
		System.out.println("Username is empty");
		
		}
		
		
	}


}
