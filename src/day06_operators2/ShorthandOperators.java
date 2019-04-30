package day06_operators2;

public class ShorthandOperators {

	public static void main(String[] args) {
		int students = 45;
	System.out.println("Students: " + students);
	
	students = students + 5;
	System.out.println("Students: " + students);
	
	students = students -2;
	System.out.println("Students: " + students);
	
	int teachers = 10;
	System.out.println("Teachers: " + teachers);
    teachers +=2; // increace teachers by 2. 
    //teachers = teachers +2;
    teachers -=5; // decrease teachers by 5.
   
    int cars = 12;
    cars *=2; // cars = cars *2;
    
    System.out.println(cars);
    
    cars +=cars; 
    System.out.println(cars);
    
    int shoes = 20;
    shoes /= 4;
    System.out.println(shoes);
    
    double price = 45.50;
    int amount = 5;
    price += amount; //45.50+5
    System.out.println(price);
    
    int minutes = 66;
    minutes %= 60;
    System.out.println("remaining: " + minutes);
    
    int pennies = 550;
    pennies%=100; // pennies = pennies%100;
    System.out.println("pennies left: " + pennies);
    
    int count = 1;
    count = count + 1; //2
    count+= 1; //3
    count ++; //4
    
    
	}

}
