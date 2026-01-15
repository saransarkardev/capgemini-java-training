package string;

public class Program2 {
	public static void main(String[] args) {
		
		// Objects will be created in String constant Pool Area
		String s1 = "Hello"; // id=22
		String s2 = "Hello "; // id=23
		String s3 = "Hello"; // id=22
		String s4 = " Hello"; // id=24
		String s5 = "  Hello  "; // id=25
		String s6 = "Hello "; // id=23
		String s7 = " Hello"; // id=24
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		System.out.println(s7.hashCode());
	}
}
