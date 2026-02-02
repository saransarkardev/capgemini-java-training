package sorting;
import java.util.ArrayList;

public class MergeSort {
	static void merge(int[] arr, int low, int mid, int high) {
		// This part is taking
		// ⏱️ Time Complexity: O(n)
		// 🧠 Space Complexity: O(n)
		ArrayList<Integer> temp = new ArrayList<>();

		int left = low;
		int right = mid + 1;

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}

		// If elements are still present in the left array
		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}

		// If elements are still present in the right array
		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}

		// now shifting the data from temp array to the original array
		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}
	}

	static void mergeSort(int[] arr, int low, int high) {
		// This part is taking
		// ⏱️ Time Complexity: O(log n)
		// 🧠 Space Complexity: O(1)

		// base condition of recursion
		// both low and high pointing to a single element
		if (low == high) {
			return;
		}

		int mid = (low + high) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	public static void main(String[] args) {
		// Overall
		// ⏱️ Time Complexity: O(n log n)
		// 🧠 Space Complexity: O(n)
		int[] arr = { 2, 4, 2, 1, 4, 8, 5, 2, 1, 6 };
		int n = arr.length;

		// Calling the mergeSort Function
		mergeSort(arr, 0, n - 1);

		// Printing the array elements after sorting it
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
