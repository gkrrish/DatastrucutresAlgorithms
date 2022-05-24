package com.ds.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SortArray<T> {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		int[] x = { 9,2,4,8,7,8,9,1 };
//		int[] y = localsort(x);
//		System.out.println(Arrays.toString(y));
		//exam code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		
		StringTokenizer tk=new StringTokenizer(br.readLine());
		int[] givenArray=new int[test];
		for(int i=0; i<test; i++) {
			givenArray[i]=Integer.parseInt(tk.nextToken());
		}
			System.out.println(Arrays.toString(localsort(givenArray)));
	}

	public static int[] localsort(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i+1; j <=array.length-1; j++) {
				int local=array[i];
			   if(local>array[j]) {
				   array[i]=array[j];
				   array[j]=local;
			   }
			}

		}
		return array;

	}

}
