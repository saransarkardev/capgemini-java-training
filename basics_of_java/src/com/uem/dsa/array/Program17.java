package com.uem.dsa.array;

// WAP to check if an array is sorted or not.
public class Program17 {
	private static boolean checkSorted(int[] nums) {
		
		// Checking if array is sorted in ascending order or not.
		
		for (int i=0; i<nums.length-1; i++) {
			if (nums[i] > nums[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		int[] nums = {2,4,6,8,9};
		
		if (checkSorted(nums)) {
			System.out.println("Array is sorted.");
		}
		else {
			System.out.println("Array is Not sorted.");
		}
	}
}
