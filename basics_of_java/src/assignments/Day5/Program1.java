package assignments.Day5;
//Find the Sum of All Possible Sub arrays
//Given an integer array of size n, find the sum of elements of all possible contiguous subarrays of the array.
//Sample Input: [1, 2, 3]
//Sample Output: 20
public class Program1 {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		
		
		int totalSum = 0;
		for (int i=0; i<nums.length; i++) {
			int sum = 0;
			for (int j=i; j<nums.length; j++) {
					sum += nums[j];
					totalSum += sum;
				
			}
		}
		
		System.out.println("Sum is "+ totalSum);
	}
}
