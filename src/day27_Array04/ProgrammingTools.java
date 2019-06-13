package day27_Array04;

public class ProgrammingTools {

	public static void main(String[] args) {
		
String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};

//for (int i =0; i< tools.length; i++) {
//	if (tools[i].equals("Java")) {
//		System.out.println("Programming language");
//		if (tools[i].equals("Selenium")) {
//			System.out.println("test Automation");
//			if (tools[i].equals("TestNG") ||tools[i].contentEquals("JUnit")) {
//				System.out.println("Testing tool");
//				if (tools[i].equals("Cucumber")) {
//					System.out.println("BDD Style testing");
//					if (tools[i].equals("Maven")) {
//						System.out.println("Programming language");
//	}
//	
//}
//			}}}}

for (String tool: tools) {
	switch (tool.toLowerCase()) {
	case "Java":
		System.out.println("Programming language");
		break;
	case "TestNg": // <== means "or" instead of || we just add case
	case "JUnit":
		System.out.println("Unit testing");
		break;
		//...
	
	}
}



}
}