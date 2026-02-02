package sorting;

public class InsertionSort {
	static void insertionSort(int[] arr) {

		// ⏱️ Time Complexity (Wrost + Avg): O(n2)
		// ⏱️ Time Complexity (Best): O(n)
		// 🧠 Space Complexity: O(1)

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			// select the first element from the unsorted part
			int j = i;

			// place the selected element to its correct order
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;

				j--;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 1, 6, 5, 7, 8, 2, 9 };

		insertionSort(arr);

		// print the array for checking
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
