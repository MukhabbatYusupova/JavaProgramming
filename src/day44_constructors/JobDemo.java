package day44_constructors;

import java.util.ArrayList;

public class JobDemo {
	
	public static void main(String[] args) {
		
		Job job1 = new Job();
		
		Job job2 = new Job("Developer");
		
		Job job3 = new Job("Amazon", "STED", 130_000.00);
		
		System.out.println(job1.toString());
		System.out.println(job2);
		System.out.println(job3);
		
		
		ArrayList <Job> list = new ArrayList<>();
		
		list.add(job3);
		list.add(new Job("Scrum Master", "Google", 123_000));
		list.add(new Job("STED", "FreddieMac", 115_000));
		list.add(new Job("BA", "Leidos", 98_000));
		list.add(new Job("Seniour QA Tester", "Delta", 150_000));
		
		
		System.out.println(list);
		
		double max = list.get(0).getAnnualSalary();
		int highestIndex =-1;
			for (int i =0; i<list.size(); i++) {
				if (list.get(i).getAnnualSalary()> max) {
					max= list.get(i).getAnnualSalary();
				    highestIndex = i;
				
				}
			}
			
			
		//	Job bestJob = list.get(highestIndex);
			
			System.out.println("Highest Salary job: "+list.get(highestIndex).toString());
				System.out.println(max);
				
				
				
				
				
	}

}
