package stringbuilder;

public class Program3 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		
		// Reverse a string
		System.out.println(sb.reverse());
		
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
