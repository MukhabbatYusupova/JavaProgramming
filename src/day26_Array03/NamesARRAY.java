package day26_Array03;

import java.util.Arrays;
import java.util.Random;

public class NamesARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
String [] names = {"James","Mary",
					"John","Patricia",
					"Robert","Jennifer",
					"Michael","Linda",
					"William","Elizabeth",
					"David","Barbara",
					"Richard","Susan",
					"Joseph","Jessica",
					"Thomas","Sarah",
					"Charles","Margaret",
					"Christopher","Karen",
					"Daniel","Nancy",
					"Matthew","Lisa",
					"Anthony","Betty",
					"Donald","Dorothy",
					"Mark","Sandra",
					"Paul","Ashley",
					"Steven","Kimberly",
					"Andrew","Donna",
					"Kenneth","Emily",
					"George","Carol",
					"Joshua","Michelle",
					"Kevin","Amanda",
					"Brian","Melissa",
					"Edward","Deborah",
					"Ronald","Stephanie",
					"Timothy","Rebecca",
					"Jason","Laura",
					"Jeffrey","Helen",
					"Ryan","Sharon",
					"Jacob","Cynthia",
					"Gary","Kathleen",
					"Nicholas","Amy",
					"Eric","Shirley",
					"Stephen","Angela",
					"Jonathan","Anna",
					"Larry","Ruth",
					"Justin","Brenda",
					"Scott","Pamela",
					"Brandon","Nicole",
					"Frank","Katherine",
					"Benjamin","Samantha",
					"Gregory","Christine",
					"Raymond","Catherine",
					"Samuel","Virginia",
					"Patrick","Debra",
					"Alexander","Rachel",
					"Jack","Janet",
					"Dennis","Emma",
					"Jerry","Carolyn",
					"Tyler","Maria",
					"Aaron","Heather",
					"Henry","Diane",
					"Jose","Julie",
					"Douglas","Joyce",
					"Peter","Evelyn",
					"Adam","Joan",
					"Nathan","Victoria",
					"Zachary","Kelly",
					"Walter","Christina",
					"Kyle","Lauren",
					"Harold","Frances",
					"Carl","Martha",
					"Jeremy","Judith",
					"Gerald","Cheryl",
					"Keith","Megan",
					"Roger","Andrea",
					"Arthur","Olivia",
					"Terry","Ann",
					"Lawrence","Jean",
					"Sean","Alice",
					"Christian","Jacqueline",
					"Ethan","Hannah",
					"Austin","Doris",
					"Joe","Kathryn",
					"Albert","Gloria",
					"Jesse","Teresa",
					"Willie","Sara",
					"Billy","Janice",
					"Bryan","Marie",
					"Bruce","Julia",
					"Noah","Grace",
					"Jordan","Judy",
					"Dylan","Theresa",
					"Ralph","Madison",
					"Roy","Beverly",
					"Alan","Denise",
					"Wayne","Marilyn",
					"Eugene","Amber",
					"Juan","Danielle",
					"Gabriel","Rose",
					"Louis","Brittany",
					"Russell","Diana",
					"Randy","Abigail",
					"Vincent","Natalie",
					"Philip","Jane",
					"Logan","Lori",
					"Bobby","Alexis",
					"Harry","Tiffany",
					"Johnny","Kayla"};
			
		
		System.out.println("Number of names: " + names.length);
		
		//print all names in single line doesnt matter data type
		System.out.println(Arrays.deepToString(names)); 
		
		//print colomn format
		
		for (int i=0; i<names.length; i+=2) {
			
			System.out.println(names[i]+ ", " + names[i+1]);
		}
		// print only male name
		System.out.println("Male names:");
		 for (int i=0; i< names.length; i+=2) {
			 
			 System.out.print(names[i]+ ", ");
		 }
		 
	 
		 
		 
		//print only female name
		 System.out.println("\nFemale Names");
		 for (int i=0; i<names.length; i++) {
			if(i % 2!= 0) {
				if (i==names.length-1) { //if i is last name
			 System.out.print(names[i]);  //dont print last comma
		 }else {
			 System.out.println(names[i]+ ", ");
		 }
		 
		 }
	}
//print random name
		 System.out.println("\nRandom Name");
		
		 Random random = new Random();
		
		 int r = random.nextInt(names.length);
		
		 System.out.println("Random name: " + names[r]);
		
		// print up to 4 characters 
		System.out.println();
		 
		
		for (String n:names) {
			if (n.length()<= 4) {
			System.out.print(n.toUpperCase()+ ", ");
			}
		}
	
     System.out.println("\n Names length Sort");
		 String namesupto4="";
		 String names5to6="";
		 String names7orMore = "";
		 
//		 for (int i =0; i< names.length; i++) {
//			 if (names[i].length()== 3 || names[i].length()==4) {
//				 names3to4+= names[i];
//			 } else if (names[i].length()== 5 || names[i].length()==6) {
//				 names5to6+= names[i];
//		 }
		 
		 for (String name: names) {
			 if (name.length()<=4) {
				 
				 namesupto4+=name + ", " ;
			 } else if (name.length()==5 || name.length()==6) {
				 names5to6 += name + ", ";
			 } else {
				 names7orMore += name +", ";
			 }
		 }
		 System.out.println("Names up to 4: " + namesupto4);
		 System.out.println("Names up to 5: " + names5to6);
		 System.out.println("Names 7 or more: " + names7orMore);
		 
		 
		 // lady's name first swap
		 
		 System.out.println(Arrays.toString(names));
		 String myNameorder = "";
		 for (int i=0; i<names.length; i+=2) {
		String temp = names[i];
		names[i] = names[i+1];
		names[i+1] = temp;
		}
		 System.out.println(Arrays.toString(names));
		 
	}
}
