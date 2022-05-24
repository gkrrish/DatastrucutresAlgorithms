package com.ds.algorithms;

import java.util.Arrays;

//selects minimum element and saves in another array, swap max with min
//Time complexity :
//Space complexity :

public class SelectionSort {
	public static void main(String[] args) {
		int[] x = { 9, 5, 1, 7, 3, 5, 4, 1, 9 };

		// sorting
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j <= x.length - 1; j++) {
				int local = x[i];
				if (local > x[j]) {
					x[i] = x[j];
					x[j] = local;
				}
			}
		}
		System.out.println(Arrays.toString(x));
	}
}
