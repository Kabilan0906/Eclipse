package org.colle;

import java.util.Arrays;

public class Sum {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		int b = a.length;
		for (int i : a) {
			sum += i;
		}
		System.out.println("Input array :"+Arrays.toString(a));
		System.out.println("Sum of the array :"+sum);
		System.out.println("Average of the array :"+sum/b+"."+sum%b);
		
		
		String[] x = { "List", "set", "map", "Array" };
		for (String y : x) {
			if (y.charAt(0) >= 'A' & y.charAt(0) <= 'Z') {
				System.out.println(y);
			}
		}
	}
}
