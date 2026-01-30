package com.uem.dsa.string;


// check weather two strings are equal or not.
public class Program5 {
	
	private static boolean checkEqual(String s1, String s2) {
		
		if (s1.length() != s2.length()) return false;
		
		for (int i=0; i<s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) 
				return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		String s1 = "Saran";
		String s2 = "Saran";
		
		System.out.println(checkEqual(s1, s2));
		
	}

}
