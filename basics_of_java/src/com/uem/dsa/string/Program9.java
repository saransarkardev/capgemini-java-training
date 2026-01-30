package com.uem.dsa.string;


// Count words in a string. 

public class Program9 {
	private static int countWords(String s) {
		
		// not optimal one though. Need to be fixed.
		
		String[] words = s.trim().split(" ");
		
		return words.length;
	}
	public static void main(String[] args) {
		String s = "  Hello World, my name is Saran  ";
		
		System.out.println(countWords(s));
		
	}
}
