package exception_handling;

public class ThrowDemo2 {

	// Checked Exception --> compile time exception
	public static void vote (int age) throws ClassNotFoundException{
		
		if (age >= 18) {
			System.out.println("Candidate voted.");
		}
		else {
			throw new ClassNotFoundException();
			
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
