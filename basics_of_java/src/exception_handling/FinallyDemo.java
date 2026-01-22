package exception_handling;

public class FinallyDemo {
	public static void main(String[] args) {
		
		try {
			System.out.println("Program Started");
			
			System.out.println("Statement 1");
			
			System.out.println(100/0);
			
			System.out.println("Statement 2");
			
			System.out.println("Program ended");
		}
		catch(ArithmeticException e) {
			System.out.println("Error occured");
		}
		finally {
			System.out.println("Statement 3");
		}
	}
}
