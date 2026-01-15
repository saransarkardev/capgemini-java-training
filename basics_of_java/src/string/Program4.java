package string;

public class Program4 {
	public static void main(String[] args) {
		
		// s refers to the string literal "Hello" stored in the String Constant Pool.
		String s = "Hello"; // new String();
		
		
		// Compares the content of s with the string literal "Hello".
		// Both contain the same characters -> true
		System.out.println(s.equals("Hello"));
		
		
		// Compares the content of two string literals.
		// Both contain the same characters -> true
		System.out.println("Hello".equals("Hello"));
	}
}
