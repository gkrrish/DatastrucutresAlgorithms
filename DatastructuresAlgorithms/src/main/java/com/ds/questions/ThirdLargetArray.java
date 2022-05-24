package com.ds.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ThirdLargetArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());

		StringTokenizer tk = new StringTokenizer(br.readLine());
		int[] x = new int[size];
		for (int i = 0; i < size; i++) {
			x[i] = Integer.parseInt(tk.nextToken());
		}

		// sorting
		for (int i = 0; i < x.length; i++) {

			for (int j = i + 1; j <= x.length - 1; j++) {
				int local = x[i];
				if (local > x[j]) {
					x[i] = x[j];
					x[j] = local;
				}
			}

		}//9 8 4 5 6 3
		System.out.println(Arrays.toString(x));
		System.out.println(x[x.length-(x.length-4)]);

	}

}
