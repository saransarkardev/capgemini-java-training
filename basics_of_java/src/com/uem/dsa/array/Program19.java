package com.uem.dsa.array;

import java.util.HashMap;
import java.util.Map;

// Count duplicate elements in an array.

public class Program19 {
	private static int countDuplicate(int[] nums) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int num: nums) 
			map.put(num, map.getOrDefault(num, 0) +1);
		
		// It will store the no. of duplicate elements.
		int count = 0;
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) 
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		
		int[] nums = {2,4,6,8,9,4,2,7,2,6,1};
		
		System.out.println("No of duplicate elements: " + countDuplicate(nums));
	}
}
