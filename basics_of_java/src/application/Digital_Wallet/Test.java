package application.Digital_Wallet;

public class Test {
	public static void main(String[] args) {
		
		Wallet w1 = new Basic(1, "saran");
		Wallet w2 = new Premium(2, "rahul");
		
		try {
			w1.addMoney(5000);
			w1.payMoney(200);
			System.out.println("Payment successful for wallet 1");
			w2.addMoney(30000);
			w2.payMoney(20000);
			System.out.println("Payment successful for wallet 2");
		}
		catch(Exception e) {
			System.out.println("Exception: " +e.getMessage());
		}
		System.out.println(w1);
		System.out.println(w2);
		
}
}
