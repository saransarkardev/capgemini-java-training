package com.uem.dsa.string;

// Find length without using length() method.
public class Program7 {
	private static int findLength(String s) {
		
		int count = 0;
		for (char ch : s.toCharArray()) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		String s = "Saran";
		
		System.out.println(findLength(s));
	}
}
