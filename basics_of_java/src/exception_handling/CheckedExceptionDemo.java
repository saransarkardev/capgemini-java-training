package exception_handling;

public class CheckedExceptionDemo {
	
	public static void main(String[] args) throws ClassNotFoundException{
		
		System.out.println("Program started");
		
		try {
			Class.forName("");
		}
		catch(ClassNotFoundException c) {
			System.out.println("Exception handled.");
		}
		

		
		System.out.println("Program ended");
	}
}
