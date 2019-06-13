package day54_inheritanceReview;

public class finalKeyword {
	
	/* final: value can not be changed
	 * variable, class and methods
	 * 
	 * final VARIABLE: 
	 * local variable(belongs to method): does not need to be
	 *                   initialized immediately, cannot be reassigned.
	 *                   
	 * instance variable(belongs to the object): it needs to be initialized immediately
	 *                   or in INIT block, cuz it executed as soon as obj created. if we didnt use init 
	 *                   block we can use constructor
	 *                   
	 * static variable (class variable): u can initialize in static block ONly or immeaditely when u declared
	 * 
	 * 
	 * final CLASS: can not be extended(inherited)
	 *              abstract class can not be final
	 *              
	 * final METHOD: can not be override
	 *               constructor can not be final!
*/
	
	public static void main(String [] args) {
		final boolean result = false;
		// result = false; even the value is the same it can not be reassign
	}
	
	
}

class data1{
	private String password = "123456";
	private final int age = 40;
	
	public String getPassword() {
		return password;
	}
	
	public int getAge() {
		return age;
	}
	
	public void  setPassword(String password) {
		this.password = password;
	}
	
	// for final private variable no SETTERS! only GETTER!
	
}
