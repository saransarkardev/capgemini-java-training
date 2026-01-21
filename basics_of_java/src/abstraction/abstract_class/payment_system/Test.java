package abstraction.abstract_class.payment_system;

public class Test {
	public static void main(String[] args) {
		
		Payment p1 = new CreditCard(50000.0, "SBI");
		p1.paymentInfo();
		p1.makePayment();
		
		Payment p2 = new UPI(7000.0, "Gpay");
		p2.paymentInfo();
		p2.makePayment();
	}
}
