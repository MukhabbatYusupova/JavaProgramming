package day23_break_Continue;

public class Arrays1 {

	public static void main(String[] args) {
		
int [] numbers = new int [3];

int num1 =5;
int num2 = 7;
int num3 = 10;
	//assign to the first variable value of num1, 
numbers[0]=num1;
numbers [1]=num2;
numbers[2]=num3;

System.out.println(numbers[0]);
System.out.println(numbers[1]);
System.out.println(numbers[2]);

// using loop printing all arrays

for (int i = 0; i< numbers.length; i++) {// length is property of int != length() method of string
System.out.println(numbers[i]);


}
//byte [] bytesArray = new byte[Integer.MAX_VALUE-5];

String [] names = new String [4];
String [] names2 = {"Shaun", "Roman", "Vlad", "Burak"};

System.out.println(names2[3]);
//String [] countries = {};// empty string;
//countries[0]= "USA";    // error u will get. array has fixed size 


String [] fruits = new String [] {"apple", "orange"};
System.out.println(fruits[1]);


String [] colors = new String [3];
String str1 = "blue";
String str2 = "white";
String str3 = "green";

colors [0]= str1;
colors[1]= str2;
colors [2] = str3;
for (int i=0; i<= 2; i++) {
System.out.print("The colors in Uzbekstans national Flag: " +colors[i]);
}

	}

}
