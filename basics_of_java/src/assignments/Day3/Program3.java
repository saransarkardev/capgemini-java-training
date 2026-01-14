package assignments.Day3;

/*
 	you are building a music playlist application, and you want to implement a feature that allows users to shuffle their playlists. To shuffle the playlist, you decide to rotate the songs to the left by a given number of positions. Each song in the playlist is represented by an element in an array, and you need to rotate the songs to the left by a specified number of positions.

For example:-
Consider an array representing a playlist: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Rotate the playlist to the left by 3 positions.
After rotation, the playlist becomes: [4, 5, 6, 7, 8, 9, 10, 1, 2, 3]

 */
public class Program3 {
	public static void reverse(int[] nums, int low, int high) {
		
		while (low < high) {
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			low++;
			high--;
		}
	}
	public static void rotateLeftArray(int[] nums, int k) {
		int n = nums.length;
		
		k = k%n;
		
		reverse(nums, 0, k-1);
		reverse(nums, k, n-1);
		reverse(nums, 0, n-1);
	}
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int k = 3;
		rotateLeftArray(nums, k);
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+ " ");
		}
	}
}
