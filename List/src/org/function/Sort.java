package org.function;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
	public static void main(String[] args) {
		int[][] arr = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return Integer.compare(a[0], b[0]);
			}
		});
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
	}
	
}