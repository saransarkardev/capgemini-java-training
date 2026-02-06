package searching.binary_search;

public class Program {
	private static int fn(int[] nums) {
		int n = nums.length;

		int low = 1, high = n - 2;

		if (nums[0] > nums[1])
			return nums[0];
		if (nums[n - 1] > nums[n - 2])
			return nums[n - 1];

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
				return nums[mid];
			}

			// in the increasing part
			else if (nums[mid] > nums[mid - 1]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 8, 12, 13, 5, 2 };

		System.out.println(fn(nums));
	}

}
