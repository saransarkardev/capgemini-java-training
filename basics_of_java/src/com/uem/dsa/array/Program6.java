package com.uem.dsa.array;

import java.util.Arrays;

// Delete element from the array. (Only the first occurence)

public class Program6 {
	public static void main(String[] args) {
		int[] nums = {10,60,20,40,20,30};
		
		int element = 20;
		
		boolean flag = false;
		
		for (int i=0; i<nums.length-1; i++) {
			if (nums[i] == element) {
				flag = true;
			}
			if (flag == true) {
				nums[i] = nums[i+1];
			}
		}
		nums[nums.length-1] = 0;
		
		System.out.println(Arrays.toString(nums));
	}
}
