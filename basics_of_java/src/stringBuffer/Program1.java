package stringBuffer;

public class Program1 {
	public static void main(String[] args) {
		// StringBuffer is same as StringBuilder except thread safety ..
		// StringBuffer is thread safe.
		// Methods and properties in StringBuffer is same as StringBuilder.
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		
		// Reverse a string using string buffer
		System.out.println(sb.reverse());
		
		// length of the string
		System.out.println(sb.length());
		
		sb.append("Hello1234");
		
		System.out.println(sb);
		
		// start deleting the characters from index 3 of sb upto 5 , index-1.
		sb.delete(3,6);
		System.out.println(sb);
		
		// insert the string value at index 2 of the string
		sb.insert(2,"student");
		System.out.println(sb);
	}
}
