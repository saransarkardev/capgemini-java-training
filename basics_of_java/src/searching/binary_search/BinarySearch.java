package searching.binary_search;

public class BinarySearch {
	
	private static boolean binarySearch(int[] nums, int target) {
		int low = 0, high = nums.length-1;
		
		while (low <= high) {
			int mid = low + (high-low)/2;
			
			if (nums[mid] == target) return true;
			else if (target > nums[mid]) low = mid+1;
			else high = mid-1;
		}
		// Target element not present in the array.
		return false;
	}
	public static void main(String[] args) {
		
		int[] nums = {2,4,7,9,11,23};
		
		int target = 7;
		
		System.out.println(binarySearch(nums, target));
	}
}
