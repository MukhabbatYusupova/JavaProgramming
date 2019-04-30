package day28_ArrayReacap;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FastFoodRest {

	public static void main(String[] args) throws IOException {
		
// read all data and assign to array
		
String [] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);	
		
		
		System.out.println("Data Size: "+ data.length);
		// print first row
		
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[data.length-1]);
	
		
		// print each restaurant information in seperate lines
		int counter =0;
		for (String d:data) {
			//System.out.println("#"+counter+" "+d);
			counter++;
		}
		
		// Print all rest in VA
		int count=0;
		for(int i = 0; i<data.length; i++) {
			if (data[i].contains(",VA,")) {
				System.out.println(data[i]);
				count++;
				}
			}System.out.println(count);
		
			for(int i = 0; i<data.length; i++) {
				if (data[i].contains(",McDonald's,")) {
					count++;}
				}System.out.println(count);
				
				//Print VA rest with city name
				
				for(String city:data) {
					if (city.contains(",VA,")) {
						String[] wordArr = city.split(","); 
					 System.out.println(wordArr[2]+" - "+ wordArr[1]);
					 }
				}

	}

}
