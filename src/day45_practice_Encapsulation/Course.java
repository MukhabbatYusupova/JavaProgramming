package day45_practice_Encapsulation;
import java.util.*;
public class Course {
	
	private String name;
	private List<String> teachers = new ArrayList<>();
	private List<String> students = new ArrayList<>();
	
	
	public void addStudent(String stName) {
		students.add(stName);
	}
	
	
	public void addTeacher(String tName) {
		teachers.add(tName);
	}
	
	
	public void removeStudent(String stName) {
		students.remove(stName);
	}
	
	public void removeTeacher(String tName) {
		teachers.remove(tName);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<String> teachers) {
		this.teachers = teachers;
	}
	public List<String> getStudents() {
		return students;
	}
	public void setStudents(List<String> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", teachers=" + teachers + ", students=" + students + "]";
	}
	
	

}
