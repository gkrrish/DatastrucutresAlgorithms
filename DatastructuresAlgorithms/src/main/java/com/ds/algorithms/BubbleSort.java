package com.ds.algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] x = { 5, 9, 3, 2, 8, 1 };

		for (int i = 0; i <= x.length - 1; i++) {
			for (int j = 0; j < x.length - i - 1; j++) {
				if (x[j] > x[j + 1]) {
					int temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(x));
	}
}
