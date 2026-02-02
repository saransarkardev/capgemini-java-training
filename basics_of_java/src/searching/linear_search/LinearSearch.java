package searching.linear_search;

public class LinearSearch {
	
	private static boolean linearSearch(int[] nums, int target) {
		
		for (int i=0; i<nums.length; i++) {
			if (nums[i] == target) {
				return true;
			}
		}
		// Target element not found in the array.
		return false;
	}
	public static void main(String[] args) {
		
		int[] nums = {10,60,30,23,40,70};
		
		int target = 23;
		
		System.out.println(linearSearch(nums, target));
		
	}
}
