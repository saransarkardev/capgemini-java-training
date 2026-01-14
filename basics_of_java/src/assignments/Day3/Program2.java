package assignments.Day3;
/*Write a program that segregate elements in an array consisting of only 0s and 1s. Segregating 0s and 1s in an array with all 1s appearing before 0s. 
For example:-
Input: {0, 1, 0, 1, 0, 0, 1, 1, 0, 1}
Output: {1, 1, 1, 1, 1, 0, 0, 0, 0, 0}
*/
public class Program2 {
	public static void segregate(int[] nums) {
		int n = nums.length;
		
		int index = 0;
		for (int i=0; i<n; i++) {
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
				index++;
			}
		}
	}
	public static void main(String[] args) {
		int[] nums =  {0, 1, 0, 1, 0, 0, 1, 1, 0, 1};
		
		segregate(nums);
		
		for (int i=0; i<nums.length; i++)
			System.out.print(nums[i]+ " ");
	}
}
