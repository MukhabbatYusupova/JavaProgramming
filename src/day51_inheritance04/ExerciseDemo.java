package day51_inheritance04;

public class ExerciseDemo {
	
	public static void main(String[] args) {
		
		Exercise ex = new Exercise ();
		Running run = new Running();
		Swimming sw = new Swimming();
		Yoga y = new Yoga();
		JuiJitsu jj = new JuiJitsu();
		SprintRunning srun = new SprintRunning(); // extends Running
		Snowboarding snow = new Snowboarding();
		
		System.out.println("Calories burned: " + ex.perform(30));
		System.out.println("Calories burned: " + run.perform(30));
		System.out.println("Calories burned: " + sw.perform(30));
		System.out.println("Calories burned: " + y.perform(30));
		System.out.println("Calories burned: " + jj.perform(30));
		System.out.println("Calories burned: " + srun.perform(30));
		System.out.println("Calories burned: " + snow.perform(30));
		
		   displayMSG();           // line n3

           displayMSG();           //  line n4
		

             
            

             }
	  private static void displayMSG() {
		
		int count=0;

      

                       count++;                            // line n1

 System.out.println("Welcome "+"Visit Count: "+count);  // line n2
	}
	

          

             }

	


