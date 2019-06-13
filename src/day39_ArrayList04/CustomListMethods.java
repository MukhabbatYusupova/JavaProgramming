package day39_ArrayList04;
import java.util.*;

public class CustomListMethods {

	public static void main(String[] args) {
		
	ArrayList<Integer> numsList = new ArrayList<>();
	numsList.add(10);
	numsList.add(16);
	numsList.add(10);
	numsList.add(7);
	numsList.add(8);
	numsList.add(16);
	numsList.add(4);
	
	printList(numsList);
	
	
	//
	
	List <Double> numList1 = new ArrayList<>();
	
	numList1.add(10.33); numList1.add(10.22);numList1.add(7.34);numList1.add(8.99);
    numList1.add(8.12); numList1.add(3.55);numList1.add(4.76);numList1.add(8.8);	
    
    
    System.out.println(sumList (numList1));
    
    
    
    System.out.println(getList(10));
    
    ArrayList <Integer> list = getList(15);
    Integer a = getList(15).get(getList(15).size()-1);
    System.out.println(a);
    
    Integer oneValue = list.get(list.size()-1);
    
    System.out.println(oneValue);
    
    
    
    System.out.println(getRandomList(20));
    
    List <Integer> rList = getRandomList(10);
    Collections.sort(rList);
    System.out.println(rList);
    
    
    List <String> strNums =new ArrayList<>();
    strNums.add("123");
    strNums.add("34");
    strNums.add("987");
    
    
    
    System.out.println(convertToIntList(strNums));
    
    
    

	}
	
	public static void printList(ArrayList<Integer>nums) {
	
		for (Integer i: nums) {
			System.out.print(i+ " ");
		}
		System.out.println();
	} 

	public static double sumList(List <Double> dList) {
		  double sum=0.0;
		for (double d: dList) {
			sum+=d;
		 }
		return sum;
	}
	
	public static ArrayList<Integer> getList(int size){
		ArrayList <Integer> newList = new ArrayList<>();
		
		for (int i=1; i<=size; i++) {
			newList.add(i);
		}
		return  newList;
	}
	
	public static List <Integer> getRandomList(int size){
		
		Random r = new Random();
		List <Integer> randomList = new ArrayList<>();
		
		for (int i=1; i<=size; i++) {
			randomList.add(r.nextInt(101));
		}
		return  randomList;
		
	}
	
	public static List<Integer> convertToIntList (List<String> strList){
		
		List <Integer> intList = new ArrayList<>();
		
		for (int i=0; i<strList.size(); i++) {
			intList.add(Integer.parseInt(strList.get(i))); 
		}
		return intList;
	}
	
	// U CAN USE FOR EACH LOOP
	
public static List<Integer> convertToIntList2 (List<String> strList){
		
		List <Integer> intList2 = new ArrayList<>();
		
		for (String str : strList) {
			intList2.add(Integer.parseInt(str));
		}
		return intList2;
	}
	
}
