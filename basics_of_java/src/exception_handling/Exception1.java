package exception_handling;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println("Program Started");
		
		try {
			int a = 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("can not divide by zero.");
		}
		
		
		System.out.println("Program Ended");
	}
}
