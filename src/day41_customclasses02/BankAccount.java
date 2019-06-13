package day41_customclasses02;

public class BankAccount {
	
	double balance;
	int accountNum;
	String accountHolder;

	
	public void deposit(double amount) {
		System.out.println("depositing $"+ amount + " to "+ accountNum );
		
		balance+=amount;
	}
	
	public void withdraw (double amount) {
		System.out.println("Withdrawing $"+ amount+ " from "+ accountNum);
		balance-= amount;
		if (balance < 0) {
			balance -=35;
		}
		
	}
	
	public void showBalance() {
		System.out.println("===================");
		System.out.println("Account holder: " + accountHolder);
		System.out.println("Account number: "+accountNum); 
		System.out.println("Balance: $"+ balance);
		System.out.println("===================");
		
	}
	
	public void charge (double price, String item) {
		
		
		if (balance >= price) {
			System.out.println("Transaction is succesfull for amount: $"+ price);
			balance-= price;
		}else {
			System.out.println("Not enough money to buy " + item+ " for the price: "+ price+ " :(");
		}
	}
	
}
