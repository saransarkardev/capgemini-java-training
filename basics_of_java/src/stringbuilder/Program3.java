package stringbuilder;

public class Program3 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		System.out.println(sb.reverse());
		
		sb.append("Hello1234");
		
		System.out.println(sb);
		
		sb.delete(3,6);
		System.out.println(sb);
		
		sb.insert(2,"student");
		System.out.println(sb);
				
	}
}
