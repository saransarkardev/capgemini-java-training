package com.uem.dsa.string;

// Check if a string is Binary or not.

public class Program11 {
	private static boolean checkBinary(String s) {
		
		for (int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != '0' && ch != '1') {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		String s = "010110110111";
		
		System.out.println(checkBinary(s));
	}
}
