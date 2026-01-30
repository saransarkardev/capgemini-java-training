package com.uem.dsa.array;

// WAP to find an element in the array using Linear Search.
public class Program15 {
	private static boolean findElement(int[] nums, int target) {
		
		for (int i=0; i<nums.length; i++) 
			// Element found in the array.
			if (nums[i] == target)
				return true;
		
		// Element not present in the array.
		return false;
	}
	public static void main(String[] args) {
		
		int[] nums = {2,4,6,8,9};
		
		int target = 8;
		
		if (findElement(nums, target) == true) {
			System.out.println("Element " + target + " is present in the array.");
		}
		else {
			System.out.println("Element" + target + " is Not present in the array.");
		}
	}
}
