package day26_ARRAY;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		
String words = "java,kava,html,selenium";
String [] wordsArray = words.split(",");
System.out.println(wordsArray.length);
System.out.println(Arrays.toString(wordsArray));

for (String word : wordsArray) {
	System.out.println(word);
}

String diceResult = "1 - 20 of 1,461 positions";
String [] str = diceResult.split(" "); //spaces dissapear

System.out.println("Search result total: " + str[4]);

for (String temp : str) {
System.out.println(temp);
}

String [] str2 = diceResult.split ("of");
System.out.println(str2[0].trim());
System.out.println(str2[1].trim());


String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
 String [] allWords = sentence.split(" "); 
 String [] iSplit = sentence.split("I");
 String [] happySplit = sentence.split("happy");
  
 System.out.println();
 System.out.println(Arrays.toString(allWords));
 System.out.println(Arrays.deepToString(iSplit));
 System.out.println(Arrays.deepToString(happySplit));
 
 System.out.println();
  for (String w: allWords) {
	  System.out.println(w);
  }
   for (String h: happySplit) {
	   System.out.println(h);
   }
	for (String i: iSplit) {
		System.out.println(i);
	}
	
	System.out.println();
	
	String word = "java";
	char[] chars = word.toCharArray();
	
	for (char ch: chars) {
		System.out.println(ch);
	}
	
	
	
	
	
	
	}

}
