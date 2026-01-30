package com.uem.dsa.array;

import java.util.Arrays;
// Delete element from position.

public class Program5 {
	
	public static void main(String[] args) {
		int[] nums = {10,60,20,40,30};
		
		int pos = 3;

		
		for (int i=pos; i<nums.length-1; i++) {
			nums[i] = nums[i+1];
		}
		nums[nums.length-1] = 0;
		
		System.out.println(Arrays.toString(nums));
	}
}
