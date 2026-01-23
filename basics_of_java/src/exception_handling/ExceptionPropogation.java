package exception_handling;

public class ExceptionPropogation {
	
	public static int getNameLength(String s){
//		try {
			return s.length();
//		}
//		catch(NullPointerException e) {
//			return -1;
//		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Program started");
		
		String s = null;
		
		try {
			System.out.println(getNameLength(s));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	
		
		
		System.out.println("Program ended");
	}
	
}
