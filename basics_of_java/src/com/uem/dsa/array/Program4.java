package com.uem.dsa.array;

import java.util.Arrays;

// Insert element in the same array

public class Program4 {
	public static void main(String[] args) {
		int[] nums = {10,30,8,6,7,2,0};
		
		int n = 40;
		int pos = 3;

		
		for (int i=nums.length-2; i>=pos; i--) {
			nums[i+1] = nums[i];
		}
		nums[pos] = n;
		
		System.out.println(Arrays.toString(nums));
	}
}
