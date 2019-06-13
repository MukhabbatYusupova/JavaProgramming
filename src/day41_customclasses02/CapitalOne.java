package day41_customclasses02;

public class CapitalOne {
	public static void main(String[] args) {
		BankAccount myaccount = new BankAccount();
		
		myaccount.accountHolder = "Mukhabbat Osman";
		myaccount.accountNum =944123384;
		myaccount.balance = 5000.0;
		
		myaccount.deposit(600);
		myaccount.withdraw(100);
		myaccount.showBalance();
		myaccount.charge(200, "watch");
		myaccount.charge(18000, "Toyota CoConut");
	}

}
