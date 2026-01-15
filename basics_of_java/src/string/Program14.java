package string;

/* 
 	write a program to check Given String is Palindrome or not.
Explanation:-
  Reverse the String, After the Reverse Given String check the reversed string and user Given String Both are the same or not.
      based on the result return a  suitable message 
    
Example:-
        Input:-
                        String str = "racecar";
                    After Reverse:-    racecar   
                    compares the user-given String and the  Reversed String both are the same or not.
                   both are the same print Pallindrome otherwise print not a Pallindroome.
         output:-
                     The Given String is Palindrome
 */

public class Program14 {
	public static boolean checkPalindrome(String s) {
		
		int low = 0, high = s.length()-1;
		
		while (low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "racecar";
		
		if (checkPalindrome(s) == true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
