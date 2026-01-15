package string;

public class Program5 {
	public static void main(String[] args) {
		
		// Creates a String object "Hello" in the String Constant Pool and s refers to it.
		String s = "Hello";
		
		// Here length() is a non static method and s is storing object reference and s "Hello" is stored in String constant pool area.
		// Returns the number of characters in the string → 5
		System.out.println(s.length());
		
		
		char[] ch = s.toCharArray();
		// Converts "Hello" → ['H','e','l','l','o']
		for (int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		// Would throw StringIndexOutOfBoundsException
		//System.out.println(s.charAt(100));
		
		
		// Converts each character into its ASCII/Unicode byte value.
		byte[] b=s.getBytes();
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]); // Output --> H=72, e=101, l=108, l=108, o=111
		}
		
		// Checks if string starts with "Ha" → false
		System.out.println(s.startsWith("Ha"));
		
		// Checks if string ends with "o" → true
		System.out.println(s.endsWith("o"));
		
		
		// Replaces all occurrences of "l" with "a"
		// "Hello" → "Heaao"
		String res = s.replaceAll("l", "a");
		
		System.out.println(res);
		
		
		// Checks whether the character 'l' is present anywhere inside the string.
		// Since "Hello" contains 'l', it prints true.
		System.out.println(s.contains("l"));
		System.out.println(s.contains("z"));
		
		// Returns the index (position) of the first occurrence of 'l' in the string.
		// In "Hello", 'l' appears first at index 2 (0-based indexing), so it prints 2.
		System.out.println(s.indexOf("l"));
		
		// Since 'z' is not present in "Hello", it returns -1.
	    System.out.println(s.indexOf("z"));
	    
	   String s1="Java is a programming language";
	   // Splits by spaces into words
	   String[] res1=s1.split(" ");
	   
	   for(int i=0;i<res1.length;i++) {
		   System.out.println(res1[i]);
	   }
		
		
	}
}
