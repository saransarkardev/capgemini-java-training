package com.uem.dsa.array;

import java.util.Arrays;

// WAP to reverse an array without using extra space.
public class Program16 {
	private static void reverse(int[] nums) {
		
		int low = 0 , high = nums.length-1;
		
		while (low < high) {
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			low++;
			high--;
		}
		
	}
	public static void main(String[] args) {
		
		int[] nums = {2,4,6,8,9};
		
		reverse(nums);
		
		System.out.println(Arrays.toString(nums));
	}
}
