package sorting;

public class SelectionSort {
	static void selectionSort(int[] arr) {
		// ⏱️ Time Complexity (Wrost + Avg): O(n2)
		// ⏱️ Time Complexity (Best): O(n2)
		// 🧠 Space Complexity: O(1)

		int n = arr.length;

		for (int i = 0; i <= n - 2; i++) {
			// select the first element as smallest in our unsorted part in our array
			int minIndex = i;
			for (int j = i; j < n; j++) {
				// get the index of the smallest element present in our unsorted array
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			// Now swap the smallest element present in our unsorted part with the first
			// element of our unsorted array
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 1, 6, 7, 5, 3, 5, 7, 8, 3, 2, 5, 3, 9, 4 };
		selectionSort(arr);

		// print the array for checking
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
