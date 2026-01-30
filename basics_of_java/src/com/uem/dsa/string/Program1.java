package com.uem.dsa.string;

// Basics Count number of characters in a string
public class Program1 {
	public static void main(String[] args) {
		String s = "aeiouAbede";
		
		int count = 0;
		for (int i=0; i<s.length(); i++) {
			count++;
		}
		
		System.out.println("Length: "+count);
	}
}
