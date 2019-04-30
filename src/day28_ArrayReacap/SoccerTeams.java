package day28_ArrayReacap;

import java.util.Arrays;

public class SoccerTeams {

	public static void main(String[] args) {
		
String [][] teams = new String [2][4]; // to teams with 4 members
teams [0][0]= "Irina";  // first array first value assign
teams [0][1]= "Zarif";
teams [0][2]= "Cihan";
teams [0][3]= "Habib";

teams [1][0]= "Olim";
teams [1][1]= "Roman";
teams [1][2]= "Dimitriy";
teams [1][3]= "Nurs";

System.out.println("First player of first team:");
System.out.println(teams[0][0]); 

System.out.println("Last player of second team:");
System.out.println(teams[1][3]);

//print how many arrays

System.out.println("Number of teams " +teams.length);

System.out.println("Number of players in first team " + teams[0].length);
System.out.println("Number of players in second team " + teams[1].length);
	System.out.println(Arrays.deepToString(teams));
	
	int [][]num  = new int [3][4];
	
	num [0][0]=100;
	num [0][1]=123;
	num [0][2]=134;
	num [0][3]=1456;
	
	num [1][0]=200;
	num [1][1]=300;
	num [1][2]=400;
	num [1][3]=500;
	
	num [2][0]=21200;
	num [2][1]=32300;
	num [2][2]=42300;
	num [2][3]=522300;
	System.out.println(Arrays.deepToString(num));
	System.out.println(Arrays.toString(num[0]));
	
	
	int [][] scores = { {3,5,10}, {6,4,2,10} };
	
	System.out.println("Days played " + scores.length);
	System.out.println("Number of values in 1: " + scores[0].length);
	System.out.println("Number of values in 1: " + scores[1].length);
	
	System.out.println(Arrays.deepToString(scores));
	
	int [][] values = new int [4] []; // if u dont know the values number u dont have to write there
	 values [0] = new int [] {32,43,5};
	 values [1] = new int [] {32, 3456, 345, 344};
	 
	 values [2] = new int [2];
	 values [2][0] =55;
	 values [2][1]=33;
	 
	 values [3]= new int [] {5,12,45,77,34};
	 
	 System.out.println(Arrays.deepToString(values));
	
	}

}
