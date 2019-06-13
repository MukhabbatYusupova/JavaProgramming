package day38_ArrayList03;
import java.util. *;
public class SortArrayList {

	public static void main(String[] args) {
		
		List <Integer> numsList = new ArrayList<>();
		
		numsList.add(44); numsList.add(1); numsList.add(90); numsList.add(11); numsList.add(1000);
		
		System.out.println(numsList);
		
		Collections.sort(numsList);
		System.out.println(numsList);
		
		List <String> strList = new ArrayList<>();
		
		strList.add("Sal");
		strList.add("Atika");
		strList.add("Gulnar");
		strList.add("Muhabbat");
		strList.add("Maria");
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println(strList);
		
		int maxNum = Collections.max(numsList);
		int minNum = Collections.min(numsList);
		
		String maxName = Collections.max(strList);
		String minName = Collections.min(strList);
		
		System.out.println(maxNum + " | " + minNum + " | "+ maxName + " | " + minName );
		
		
		Collections.shuffle(strList);
		
		System.out.println(strList);
		
		

	}

}
