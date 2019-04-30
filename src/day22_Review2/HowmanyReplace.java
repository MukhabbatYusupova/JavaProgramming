package day22_Review2;

public class HowmanyReplace {

	public static void main(String[] args) {
		

		String word = "including webpages, images";
		System.out.println(word);
int length1 = word.length();
word = word.replace("e", "");
int length2 = word.length();
System.out.println(word);

System.out.println("length 1 " + length1);
System.out.println("length 2 " + length2);

int count = length1 -length2;
System.out.println("Count " + count);


	}

}
