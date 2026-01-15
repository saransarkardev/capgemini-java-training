package string;

/*
 	write a program to Remove a Particular user entered Character in the Given String.

Example:-

       Input:-   String s = "Hello";
                     char ch = 'l';
      output;-   Heo
 */
public class Program15 {
	public static void main(String[] args) {
		String s = "Hello";
		char ch = 'l';
		
		String ans = "";
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) != ch) {
				ans += s.charAt(i);
			}
		}
		
		System.out.println(ans);
	}
}
