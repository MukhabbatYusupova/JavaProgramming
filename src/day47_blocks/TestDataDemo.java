package day47_blocks;

public class TestDataDemo {
public static void main(String[] args) {

	System.out.println(TestData.url); // no object creating, just use class name . var name
	
	String str = TestData.url; // u can store into different var
	System.out.println(str);
	
	
	System.out.println(TestData.email); // accessing email
	//TestData td = new TestData(); <== doesnt work cuz constructor is not public
	//System.out.println(td.email);
	
}	
}
