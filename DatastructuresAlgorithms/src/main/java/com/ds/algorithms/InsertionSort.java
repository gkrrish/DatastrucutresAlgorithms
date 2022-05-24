package com.ds.algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] x = { 5, 4, 9, 4, 3, 2, 1, 5, 8, 7, 4 };

		for (int i = 1; i <= x.length - 1; i++) {
			int t = i;
			for (int j = i - 1; j >= 0; j--) {

				if (x[j] > x[t]) {
					int temp = x[j];
					x[j] = x[t];
					x[t] = temp;
				}
				--t;
			}System.out.println(Arrays.toString(x));
		}

		System.out.println(Arrays.toString(x));
	}

}
