package org.operator;

import java.util.Arrays;

public class AcendingOrderInt {
	public static void main(String[] args) {
		int[] x = { 9, 0, 8, 4, 1, 3, 2, 6 };
		for (int i = 0; i < x.length; i++) {
			int y = x[i], z = 0;
			for (int j = i + 1; j < x.length; j++) {
				if (y < x[j]) {
					y = x[j];
					z = j;
				}
			}
			if (z > 0) {
				x[z] = x[z] + x[i];
				x[i] = x[z] - x[i];
				x[z] = x[z] - x[i];
				z = 0;
			}
		}
		System.out.println(Arrays.toString(x));
	}
}
