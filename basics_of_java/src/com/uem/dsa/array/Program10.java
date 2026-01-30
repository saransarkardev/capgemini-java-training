package com.uem.dsa.array;

import java.util.Arrays;

//right rotate the array by key places

public class Program10 {
		private static void reverse(int[] nums, int low, int high) {
			
			while (low < high) {
				int temp = nums[low];
				nums[low] = nums[high];
				nums[high] = temp;
				low++;
				high--;
			}
		}
		public static void main(String[] args) {
			int[] nums = {1,2,3,4,5,6};
			
			int key = 2;
			
			int n = nums.length;
			
			key = key%n;
			
		
			reverse(nums, 0, n-key-1);
			reverse(nums, n-key, n-1);
			reverse(nums, 0, n-1);
			
			
			System.out.println(Arrays.toString(nums));
			
			
			
			
		}
			
	}