package day38_ArrayList03;
import java.util.*;
public class ContainsAll {

	public static void main(String[] args) {
		List<Integer>nums1 = new ArrayList<>();
		nums1.add(10); nums1.add(20);nums1.add(30);nums1.add(40);
		
		List<Integer>nums2 = new ArrayList<>();
		nums2.add(20); nums2.add(10);nums2.add(40);nums2.add(30);
		
		if(nums1.containsAll(nums2)){
			System.out.println("Nums1 contains all nums2");
			} else {
				System.out.println("Nums1 does not contains all nums2");
			}
		
		List<String> planA = new ArrayList<>();
		planA.add("java"); 
		planA.add("replit");
		planA.add("food");
		planA.add("ping pong");
		planA.add("run");
		planA.add("sleep");
		
		List <String> planB = new ArrayList<>();
		planB.add("food");
		planB.add("run");
		planB.add("sleep");
		planB.add("java");
		planB.add("ping pong");
		planB.add("replit");
		
		if (planA.containsAll(planB)&& planB.containsAll(planA)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		if(planA.equals(planB)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
