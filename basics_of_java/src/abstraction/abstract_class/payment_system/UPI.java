package abstraction.abstract_class.payment_system;

public class UPI extends Payment{
	
	String upiApp;
	
	public UPI(double amount, String upiApp) {
		super(amount);
		this.upiApp = upiApp;
	}
	
	@Override
	public void paymentInfo() {
		super.paymentInfo();
		System.out.println("App: "+ upiApp);
	}
	
	@Override
	public void makePayment() {
		System.out.println("Payment is done using UPI");
	}
}
