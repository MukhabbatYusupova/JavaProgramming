package day07_scannerOperators;

public class PreandPost {
public static void main (String[] args){
	
	int num1 = 10;
	int num2 = num1++;
	System.out.println("num1: " + num1);
	System.out.println("num2: "+ num2);
	 
	int n = 10;
	 int n2 = ++n;
	 System.out.println("n: " + n);
	 System.out.println ("n2: " +n2);
	 
	 int banana = 6;
	int pears = banana++;
	int apples = ++banana;
	
	System.out.println("banana: " + banana);
	System.out.println("pears: " + pears);
	System.out.println("apples: " + apples);
	 
	int friend =10;
	System.out.println(friend++);
	System.out.println(friend);
	
	int p1 =10;
	int sum = p1++ +5;  // p1+5 and assign to sum
	System.out.println(sum); //p1 = p+1
	System.out.println(p1);
	
	int batteries = 8; //9
	int oldBatteries =5; //6
	int totalBattaries = batteries ++ + ++ oldBatteries; //14
	
	System.out.println(batteries);
	System.out.println(oldBatteries);
	System.out.println(totalBattaries);
	
	
	
	
	
}
}
