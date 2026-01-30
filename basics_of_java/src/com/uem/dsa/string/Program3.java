package com.uem.dsa.string;

// check if a string is palindrome or not.
public class Program3 {
	private static boolean checkPalindrome(String s) {
		
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
		
		String s = "saras";
		
		System.out.println(checkPalindrome(s));
	}
}
