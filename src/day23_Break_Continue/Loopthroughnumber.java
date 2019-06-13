package day23_break_Continue;

public class Loopthroughnumber {

	public static void main(String[] args) {
		

		//print each number in the same line
		
		for (int i =1; i<=50; i++) {
			
			if (i%3==0) {   //it is skipping 5
				
				continue;
				// we dont print out whatever condition before the continue was
			
			}
			
		if (i%20 ==0) { // stop at 20. exit the code block
			break; 
			//continue;
		}
		System.out.print(i+ (" "));
		}

	}

}
