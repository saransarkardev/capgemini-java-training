package string;

public class Program8 {
	public static void main(String[] args) {
		System.out.println("d".matches("[abc]"));
		System.out.println("d".matches("[^abc]"));
		System.out.println("m".matches("[a-z]"));
		System.out.println("M".matches("[a-z]"));
		System.out.println("M".matches("[A-Z]"));
		
		System.out.println("abc".matches("[a-z]+"));
		System.out.println("ABC".matches("[A-Z]+"));
		System.out.println("abcABC".matches("[a-zA-Z]+"));
		System.out.println("abcABC".matches("[A-Za-z]+"));
		System.out.println("123".matches("[0-9]+"));
		System.out.println("abc123AZW".matches("[a-zA-Z0-9]+"));
		
		System.out.println("8".matches("[6-9]"));
		System.out.println("7876543210".matches("[6-9][0-9]+"));
	}
}
