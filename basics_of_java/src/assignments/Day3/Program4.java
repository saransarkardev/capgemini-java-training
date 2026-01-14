package assignments.Day3;
import java.util.HashMap;
import java.util.Map;
/*
 * Write a program that counts the occurrence of each element in an int array.
For example:-
Input: {1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 5}
output:-
Element : Frequency
1 : 3 times
2 : 3 times
3 : 3 times
4 : 3 times
5 : 3 times
 */
public class Program4 {
	public static void countFrequency(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for (int i=0; i<nums.length; i++) 
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : "+ entry.getValue()+" times");
		}
		
	}
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 5};
		
		countFrequency(nums);
	}
}
