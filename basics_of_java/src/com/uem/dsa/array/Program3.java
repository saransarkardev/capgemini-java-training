package com.uem.dsa.array;

import java.util.Arrays;

// Insert element in the array

public class Program3 {
	public static void main(String[] args) {
		int[] nums = {10,30,8,6,7,2};
		
		int n = 40;
		int pos = 3;
		
		int[] temp = new int[nums.length+1];
		
		for (int i=0; i<temp.length; i++) {
			if (i < pos) {
				temp[i] = nums[i];
			}
			else if (i == pos) {
				temp[i] = n;
			}
			else {
				temp[i] = nums[i-1];
			}
		}
		
		System.out.println(Arrays.toString(temp));
	}
}
