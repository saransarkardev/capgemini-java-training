package encapsulation;

public class BankAccount {
	
	// States of the class (instance variables)
	int acno;
	String name;
	double balance;
	
	BankAccount() {
		
	}
	
	BankAccount(int acno, String name, double balance) {
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}
	
	// Behaviours of the class (Methods)
	public void deposit(double amount) {
		
		if (amount >= 0) {
			balance = balance + amount;
			System.out.println("Amount of "+ amount + " Credited to your Account "+ acno);
			System.out.println("Current Balance "+ balance);
		}
		else {
			System.out.println("Invalid amount Transaction can not complete.");
		}
	}
	
	public void withdraw(int amount) {
		if (amount <= balance && amount > 0.) {
			balance = balance - amount;
			System.out.println("Amount of "+ amount + " Dedited from your Account "+ acno);
			System.out.println("Current Balance "+ balance);
		}
		else {
			System.out.println("Invalid amount Transaction can not complete");
		}
	}
	
	public void details() {
		System.out.println("Account no: "+ acno);
		System.out.println("Account holder name: "+ name);
		System.out.println("Account Balance: "+ balance);
	}
}
