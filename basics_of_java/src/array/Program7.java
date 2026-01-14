package array;

// Wap to find the difference between the maximum and minimum element in the array.
public class Program7 {
	public static int findMaximum(int[] nums) {
		int maxi = nums[0];
		
		for (int i=1; i<nums.length; i++) {
			if (nums[i] > maxi)
				maxi = nums[i];
		}
		return maxi;
	}
	public static int findMinimum(int[] nums) {
		int mini = nums[0];
		
		for (int i=1; i<nums.length; i++) {
			if (nums[i] < mini)
				mini = nums[i];
		}
		return mini;
	}
	public static void main(String[] args) {
		int[] nums = {5,6,3,2,1};
		
		int max = findMaximum(nums);
		int min = findMinimum(nums);
		
		System.out.println(max-min);
		
	}
}
