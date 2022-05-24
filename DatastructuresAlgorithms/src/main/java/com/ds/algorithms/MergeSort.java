package com.ds.algorithms;

class MergeSort {
	// Driver code
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
	void sort(int array[], int begin, int end) {
		if (begin < end) {
			int middle = begin + (end - begin) / 2;

			sort(array, begin, middle);
			sort(array, middle + 1, end);

			merge(array, begin, middle, end);
		}
	}

	void merge(int arr[], int begin, int middle, int end) {
		// Find sizes of two subarrays to be merged
		int n1 = middle - begin + 1;
		int n2 = end - middle;

		/* Create temp arrays */
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[begin + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[middle + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = begin;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
