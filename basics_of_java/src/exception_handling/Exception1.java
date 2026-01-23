package exception_handling;

public class Exception1 {
	public static void main(String[] args) {
		// Runtime Exception --> Unchecked exception (Compiler will allow to compile the code)
		
		System.out.println("Program Started");
		
		try {
			int b = 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("can not divide by zero.");
		}
		
		
		System.out.println("Program Ended");
	}
}
