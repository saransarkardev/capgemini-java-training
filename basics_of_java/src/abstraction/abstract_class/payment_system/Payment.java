package abstraction.abstract_class.payment_system;

public abstract class Payment {
	
	double amount;
	
	// parameterized constructor
	public Payment(double amount) {
		this.amount = amount;
	}
	
	// concrete method
	public void paymentInfo() {
		System.out.println("Amount: "+ amount);
	}
	
	// abstract method
	public abstract void makePayment();
}
