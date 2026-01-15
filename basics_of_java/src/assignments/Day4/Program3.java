package assignments.Day4;

// WAP to reverse each words in the sentence
// Brute Force

public class Program3 {
	public static String reverse(String s)  {
		String rev = "";
		
		for (int i=s.length()-1; i>=0; i--) {
			rev += s.charAt(i);
		}
		
		return rev;
	}
	public static String reverseWords(String s) {
		String[] str = s.trim().split(" ");
		
		String ans = "";
		for (int i=0; i<str.length; i++) {
			ans = ans + reverse(str[i]);
			ans += " ";
		}
		return ans.trim();
	}
	public static void main(String[] args) {
		String s = "I love programming in java";
		
		System.out.println(reverseWords(s));
	}
}
