package com.uem.dsa.array;


// Find second largest and second smallest element in the array.

public class Program8 {
	public static void main(String[] args) {
		
		int[] nums = {5,2,7,3,8,1};
		
		int maxi = Integer.MIN_VALUE;
		int secondMaxi = Integer.MIN_VALUE;
		
		int mini = Integer.MAX_VALUE;
		int secondMini = Integer.MAX_VALUE;
		
		for (int i=0; i<nums.length; i++) {
			if (nums[i] > maxi) {
				secondMaxi = maxi;
				maxi = nums[i];
			}
			if (nums[i] < mini) {
				secondMini = mini;
				mini = nums[i];
			}
			else if (nums[i] > secondMaxi && nums[i] != maxi) {
				secondMaxi = nums[i];
			}
			else if (nums[i] < secondMini && nums[i] != mini) {
				secondMini = nums[i];
			}
		}
				
		System.out.println("Second Maximum: "+ secondMaxi + ", Second Minimum: "+secondMini);
	}
}
