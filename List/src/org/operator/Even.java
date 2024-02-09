package org.operator;

import java.util.Arrays;

public class Even {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				continue;
			}
		}
		char[] x = { 'c', 'c', 'b', 'd' };
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}

}
