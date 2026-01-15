package stringbuilder;

public class Program2 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello");
		// Default capacity of StringBuilder object is 16 and it will also add the length of the string here it is 5.
		// Then here the default capacity will be 16+5 = 21.
		System.out.println(sb.capacity());
	}
}
