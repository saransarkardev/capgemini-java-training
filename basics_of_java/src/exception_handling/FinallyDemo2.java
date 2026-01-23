package exception_handling;

public class FinallyDemo2 {
	
	
	// JVM says --> I see a return statement, but before returning… I must execute finally.
	// JVM Stores the Return Value  --> Internally JVM does this --> temp = 5; later gets overriden with 100;
	// The finally block executes even after a return statement, and if finally itself contains a return, it overrides the return value from try or catch.
	public static int demo() {
		
		try {
			return 10/2;
		}
		catch(ArithmeticException e) {
			
		}
		finally {
			System.out.println("Program finished");
			return 100;
			
//			System.out.println("Dead code"); --> unreachable statement

		}
		
	}
	public static void main(String[] args) {
		
		System.out.println(demo());
	}
}
