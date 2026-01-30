package com.uem.dsa.string;

// Remove all the spaces from the string.

public class Program8 {
	private static String removeSpaces(String s) {
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				result.append(ch);
			}
		}
		
		return result.toString();
	}
	public static void main(String[] args) {
		String s = "Hello World, my name is Saran";
		
		System.out.println(removeSpaces(s));
	}
}
