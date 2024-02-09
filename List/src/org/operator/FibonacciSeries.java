package org.operator;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i >= 0; i++) {
			int c = a + b;
			a = b;
			b = c;
			if (c <= 100) {
				System.out.println(c);
			} else {
				break;
			}
		}
	}

}
