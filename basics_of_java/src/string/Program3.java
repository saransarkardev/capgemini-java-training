package string;

public class Program3 {
	public static void main(String[] args) {
		
		// s1 refers to the string literal "Hello" stored in the String Constant Pool.
		String s1 = "Hello";
		
		
		//s2 refers to a new String object created in the heap, even though the value is "Hello".
		String s2 = new String("Hello");
		
		
		// Compares memory references (addresses), not the content.
		// s1 and s2 point to different objects -> false
		System.out.println(s1==s2);
		
		
		// Compares the actual content of the strings -> "Hello" equals "Hello" -> true.
		System.out.println(s1.equals(s2));
		
		// Compares content ignoring case differences -> true.
		System.out.println(s1.equalsIgnoreCase(s2));
		
		// Lexicographically compares the strings.
		// Returns 0 if both strings are equal -> 0
		System.out.println(s1.compareTo(s2));
		
		// Checks if s1 matches the regular expression given by s2.
		// "Hello" matches regex "Hello" -> true
		System.out.println(s1.matches(s2));
		
	}
}
