package day39_ArrayList04;

public class School {
public static void main(String[] args) {
	
	// create 0bject frm student class
	
	Student student = new Student();   // Student -> data type
	                                   // student -> object name
	student.name="Roman";
	student.age = 25;
	student.subject = "Java";
	
	System.out.println("Name: "+ student.name);
	System.out.println("Age: "+ student.age);
	System.out.println("Subject: "+ student.subject);
	
	
	
	Student student2 =  new Student();
	student2.name = "Muhabbat";
	student2.age = 29;
	
	System.out.println(student2.name +" | "+ student2.age );
}
}
