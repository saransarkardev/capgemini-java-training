package abstraction.abstract_class.payment_system;

public class CreditCard extends Payment{
	
	String creditCompany;
	
	public CreditCard(double amount, String creditCompany) {
		super(amount);
		this.creditCompany = creditCompany;
		
	}
	
	@Override
	public void paymentInfo() {
		super.paymentInfo();
		System.out.println("Company: " + creditCompany);
	}
	
	@Override
	public void makePayment() {
		System.out.println("Payment is done using Credit Card");
	}
}
