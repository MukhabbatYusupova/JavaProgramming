package day12_Switch_ternary;

public class SwitchScore {
public static void main(String[]args) {
	
	int score = 1;
	
	switch(score) {// put variable name in ()
		case 1:  //value 
			System.out.println("Score is 1");
			break; // exit switch statement
		
		case 2: 
			System.out.println("Score is 2");
			break;
			
		case 3: 
			System.out.println("Score is 3");
			break;
			
		default:   // its like else block in if statement. means no options here
		    System.out.println("invalid number");
	        break; // its ok if u dont use break here
         	}
	
	
	
}
}
