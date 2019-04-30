package day22_Review2;

public class Cats {

	public static void main(String[] args) {
	int catcount=0;	
String cat="my cat your cat his can and her cat and their cat";

for (int i = 0; i<=cat.length()-3; i++){
	
	System.out.println(cat.substring(i, i+3));
	
	if (cat.substring(i, i+3).contentEquals("cat")) {
		
	 catcount ++; 
	}
	
}
System.out.println("cats: " +catcount);
	}

}
