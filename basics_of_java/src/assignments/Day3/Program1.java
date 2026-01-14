package assignments.Day3;

/*Write a program where you have given a large integer represented as an integer array arr, where each arr[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's. Increament the number By one as shown in below. Also create a new array to store increamented number in the for of single digit.
For example:-
Case 1:-
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Case 2:-
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0]. */
public class Program1 {
	public static int[] increase(int[] nums) {
		int n = nums.length;
		
		for (int i=n-1; i>=0; i--) {
			if (nums[i] < 9) {
				nums[i]++;
				return nums;
			}
			nums[i] = 0;
		}
		
		int[] temp = new int[n+1];
		temp[0] = 1;
		
		return temp;
	}
	public static void main(String[] args) {
		int[] nums = {9,9,8};
		
		nums = increase(nums);
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+ " ");
		}
	}
}
