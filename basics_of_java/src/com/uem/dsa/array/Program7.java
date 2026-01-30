package com.uem.dsa.array;

// Find largest and smallest element in the array.

public class Program7 {	
	
	public static void main(String[] args) {
		
		int[] nums = {5,2,7,3,8,1};
		
		int maxi = Integer.MIN_VALUE;
		int mini = Integer.MAX_VALUE;
		
		for (int i=0; i<nums.length; i++) {
			if (nums[i] > maxi) {
				maxi = nums[i];
			}
			if (nums[i] < mini) {
				mini = nums[i];
			}
		}
		
		System.out.println("Maximum: "+ maxi + ", Minimum: "+mini);
	}
}
