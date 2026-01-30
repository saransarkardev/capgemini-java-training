package com.uem.dsa.array;

// WAP to find the sum of all the elements in the array.
public class Program12 {
	public static void main(String[] args) {
		
		int[] nums = {2,4,6,8,9};
		
		int sum = 0;
		
		for (int i=0; i<nums.length; i++) 
			sum += nums[i];
		
		System.out.println("Sum: " + sum);
		
	}
}
