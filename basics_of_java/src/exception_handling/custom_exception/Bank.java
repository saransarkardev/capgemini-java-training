package exception_handling.custom_exception;

public class Bank {

	public static double balance = 1000;
	
	public static void debit(double amount) throws InvalidAmountException {
		
		if (amount > balance) {
			//compile time exception
			throw new InvalidAmountException("Amount is greater than balance.")
		}
		else {
			balance = balance - amount;
			System.out.println("Amount debited.");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Program started");
		
		try{
			debit(13000);
			
		}
		catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program Ended");
		
	}
}
