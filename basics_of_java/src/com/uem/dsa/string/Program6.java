package com.uem.dsa.string;

// Convert string to uppercase and lowercase.
public class Program6 {
	private static String convertToLowerCase(String s) {
		StringBuilder result = new StringBuilder();
		
		for (int i=0; i<s.length(); i++) {
			result.append(Character.toLowerCase(s.charAt(i)));
		}
		
		return result.toString();
	}
	private static String convertToUpperCase(String s) {
		StringBuilder result = new StringBuilder();
		
		for (int i=0; i<s.length(); i++) {
			result.append(Character.toUpperCase(s.charAt(i)));
		}
		
		return result.toString();	
	}
	public static void main(String[] args) {
		
		String s = "SarAn";
	
		
		System.out.println(convertToLowerCase(s));
		System.out.println(convertToUpperCase(s));
	}
}
