package com.uem.dsa.array;

import java.util.Arrays;

// WAP and copy elements from one array to another.

public class Program18 {
	public static void main(String[] args) {
		
		int[] nums = {2,4,6,8,9};
		
		int[] temp = new int[nums.length];
		
		for (int i=0; i<nums.length; i++) 
			temp[i] = nums[i];
		
		
		System.out.println(Arrays.toString(temp));
	}
}
