package stringBuffer;

public class Program1 {
	public static void main(String[] args) {
		// StringBuffer is same as StringBuilder except thread safety ..
		// StringBuffer is thread safe.
		// Methods and properties in StringBuffer is same as StringBuilder
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		System.out.println(sb.reverse());
		
		System.out.println(sb.length());
		
		sb.append("Hello1234");
		
		System.out.println(sb);
		
		sb.delete(3,6);
		System.out.println(sb);
		
		sb.insert(2,"student");
		System.out.println(sb);
	}
}
