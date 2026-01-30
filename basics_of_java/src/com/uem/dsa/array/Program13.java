package com.uem.dsa.array;

// WAP to find average of all the elements in the array.
public class Program13 {
	public static void main(String[] args) {
		
		int[] nums = {2,4,6,8,9};
		
		int sum = 0;
		int n = nums.length;
		
		for (int i=0; i<nums.length; i++) 
			sum += nums[i];
		
		System.out.println("Average: " + (double)sum/n);
	}
}
