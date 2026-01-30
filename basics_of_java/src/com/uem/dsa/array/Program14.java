package com.uem.dsa.array;

// WAP to count even and odd numbers in an array.

public class Program14 {
	public static void main(String[] args) {
		
		int[] nums = {2,4,6,8,9,3};
		
		int countEven = 0;
		int countOdd = 0;
		
		for (int i=0; i<nums.length; i++) {
			// Even elements
			if (nums[i] % 2 == 0)
				countEven++;
			// Odd elements
			else 
				countOdd++;
		}
		
		System.out.println("Even Count: "+ countEven + ", Odd Count: " + countOdd);
	}
}
