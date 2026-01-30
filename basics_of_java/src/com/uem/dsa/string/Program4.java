package com.uem.dsa.string;

// Reverse a string
public class Program4 {
	public static void main(String[] args) {
		
		String s = "Saran";
		
		
		char[] arr = s.toCharArray();
		
		int low = 0, high = arr.length-1;
		
		while (low < high) {
			char ch = arr[low];
			arr[low] = arr[high];
			arr[high] = ch;
			low++;
			high--;
		}
		
		System.out.println(new String(arr));
		
		
	}
}
