package searching.binary_search;

public class MissingNumber {
	private static int missingNumber(int[] nums) {
		
		int low = 0, high = nums.length-1;
		
		
		int diff = nums[0] - 0;
		while (low <= high) {
			int mid = low + (high-low)/2;
			
			if (nums[mid] - mid == diff) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		
		return low+diff;
	}
	public static void main(String[] args) {
		
		int[] nums = {20,21,22,2,28};
		
		
		System.out.println(missingNumber(nums));
		
		
		
		
		
		// Brute force
//		for (int i=1; i<nums.length; i++) {
//			if (nums[i] != nums[i-1]+1) {
//				System.out.println(nums[i]-1);
//				break;
//			}	 
//		}
		
		
	}
}
