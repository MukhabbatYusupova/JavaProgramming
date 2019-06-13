package day45_practice_Encapsulation;
import java.util.*;
public class CourseDemo {
	
	public static void main(String[] args) {
		
		Course course1 = new Course();
		
		course1.setName("Java Programming");
		
		List <String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Vasil");
		javaTeachers.add("Murodil");
		javaTeachers.add("Marufjan");
		javaTeachers.add("Muhtar");
		
		course1.setTeachers(javaTeachers);
		
		System.out.println(course1.toString());
		
		List <String> javaStudents = new ArrayList<>();
		
		javaStudents.add("Muhabbat");
		javaStudents.add("Maria");
		javaStudents.add("Natalia");
		javaStudents.add("Megan");
		javaStudents.add("Inna");
		
		course1.setStudents(javaStudents);
		System.out.println(course1);
		
		course1.addTeacher("Maria");
		course1.addStudent("Kate");
		
		if (course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher!");
		} else {
			System.out.println("Not added!");
		}
		
		if (course1.getStudents().contains("Kate")) {
			System.out.println("Kate is a student!");
		}
		
		course1.removeTeacher("Murodil");
		course1.removeStudent("Natalia");
		
		if (!course1.getTeachers().contains("Murodil")) {
			System.out.println("Murodil is a teacher, but removed from the list!");
		}
		
		if (course1.getStudents().contains("Natalia")==false) {
			System.out.println("Natalia is removed!");
		}
		
		
		System.out.println(course1);
		
		
		
		
	}
	
	

}
