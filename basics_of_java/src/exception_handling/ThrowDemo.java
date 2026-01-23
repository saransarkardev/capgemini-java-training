package exception_handling;

public class ThrowDemo {

	
	// Unchecked Exception --> runtime exception
	
	public static void vote(int age) {
		
		if (age >= 18) {
			System.out.println("Candidate voted.");
		}
		else {
			try {
				throw new ArithmeticException();
			}
			catch(ArithmeticException e) {
				System.out.println("Candidate can not vote.");
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Candidate went for voting.");
//		try {
			vote(17);
//		}
//		catch(Throwable t) {
//			System.out.println("Candidate can not vote.");
//		}
		System.out.println("Candidate came home.");
	}
}
