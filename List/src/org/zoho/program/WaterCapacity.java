package org.zoho.program;

public class WaterCapacity {
	public static void main(String[] args) {
		int[] x = { 3, 2, 0, 1, 4, 1, 0, 1, 5, 0, 4, 0, 2, 4 };
		int y = 0;
		int z = x.length - 1;
		int result = 0;
		for (int i = 1; i < x.length; i++) {
			if (x[i] >= x[y]) {
				if (y == i - 1) {
					y = i;
				} else {
					result += x[y] * (i - y - 1);
					for (int j = y + 1; j < i; j++) {
						result -= x[j];
					}
					y = i;
				}
			}
		}
		for (int i = x.length - 2; i >= y; i--) {
			if (x[i] >= x[z]) {
				if (z == i + 1) {
					z = i;
				} else {
					result += x[z] * (z - i - 1);
					for (int j = i + 1; j < z; j++) {
						result -= x[j];
					}
					z = i;
				}
			}
		}
		System.out.println(result);
	}

}
