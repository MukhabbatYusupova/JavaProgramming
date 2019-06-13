package day42_customClasses_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class practiceEncapsul {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	
	private int score;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	 public static int[] addElements(int[] ints1, int[] ints2) {
		    
		    int [] newArr = new int [5];
		    
		    for (int i=0; i<5; i++){
		      newArr[i]=ints1[i];}
		    	for (int j=0; j<5; j++){
		        newArr[j]+=ints2[j];
		      }
		    
		    return newArr;
		  }
		  
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(addElements(new int[] {10, 40, 50, 3, 1},
            new int[] {11, 0, 500, 44, 1101})));
		
		
		
		ArrayList <Boolean> bl = new ArrayList<>();
		bl.add(true);
		bl.add(false);
		
		

		
	}
	public static void repeateAL(ArrayList<Boolean> bl ){
		  
		  ArrayList <Boolean> modifiedList = new ArrayList<>(bl);
		 
		  modifiedList=new ArrayList <>(bl);
		 
		  
		}
}
