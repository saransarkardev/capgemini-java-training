package sorting;

public class BubbleSort {
	static void bubbleSort(int[] arr) {

		// ⏱️ Time Complexity (Wrost + Avg): O(n2)
		// ⏱️ Time Complexity (Best): O(n)
		// 🧠 Space Complexity: O(1)

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			// taking flag varaible for optimaization
			boolean flag = false;

			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap the adjacent elements
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			// the array is already sorted, no need to check furthur
			if (flag == false) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 1, 6, 7, 5, 3, 5, 7, 8, 3, 2, 5, 3, 9, 4 };

		bubbleSort(arr);

		// print the array for checking
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
