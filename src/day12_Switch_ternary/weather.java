package day12_switch_ternary;
import java.util.*;

public class weather {

	public static void main(String[] args) {
		
		System.out.println("How is the weather today?");
			Scanner scan = new Scanner (System.in);
			String weather= scan.next().toLowerCase(); // if u wanna make it in lowercase SUNNY will be equal to sunny
			
		switch (weather) {
		case "sunny":
			System.out.println("Go to Park");
			System.out.println("Code Java");
		    break;
		case "hot":
			System.out.println("Go to Swim");
			System.out.println("Code Java");
		    break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
		    break;
		case "rainy" :
			System.out.println("Go shopping");
			System.out.println("Code Java");
		    break;
		case "snow":
			System.out.println("Go to Skiing");
			System.out.println("chain your tyres");
			System.out.println("Code Java");
		    break;
		default:
			System.out.println("Code Java in any weather");
		    break;
			
		}
		
				System.out.println("### THE END ###");
	}

}
