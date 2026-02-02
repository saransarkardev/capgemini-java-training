package sorting;

public class QuickSort {
	static int partition(int[] arr, int low, int high) {
		// This part is taking
		// ⏱️ Time Complexity: O(n)
		// 🧠 Space Complexity: O(1)

		int pivot = arr[low];
		int i = low;
		int j = high;

		while (i < j) {
			// get the first greater element than arr[i]
			while (i <= high && arr[i] <= pivot) {
				i++;
			}
			// get the first smaller element than arr[j]
			while (j >= low && arr[j] > pivot) {
				j--;
			}

			if (i < j) {
				// swap the elements in i and j
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap the pivot element and the element at j
		// and place the pivot element at its correct place

		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;

		return j;
	}

	static void quickSort(int[] arr, int low, int high) {
		// This part is taking
		// ⏱️ Time Complexity: O(log n)
		// 🧠 Space Complexity: O(1)

		// when there is single element then we have to return low >= high
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	public static void main(String[] args) {
		// Overall
		// ⏱️ Time Complexity (Best + Avg): O(n log n)
		// ⏱️ Time Complexity (Wrost): O(n2) it is very hear when pivot element is
		// always small (array is already sorted)
		// 🧠 Space Complexity: O(1)

		int[] arr = { 4, 3, 1, 6, 7, 5, 3, 5, 7, 8, 3, 2, 5, 3, 9, 4 };
		int n = arr.length - 1;
		quickSort(arr, 0, n);

		for (int i = 0; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
