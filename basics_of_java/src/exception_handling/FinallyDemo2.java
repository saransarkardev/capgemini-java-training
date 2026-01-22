package exception_handling;

public class FinallyDemo2 {
	
	public static int demo() {
		
		try {
			return 10/2;
		}
		catch(ArithmeticException e) {
			
		}
		finally {
			return 100;
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println(demo());
	}
}
