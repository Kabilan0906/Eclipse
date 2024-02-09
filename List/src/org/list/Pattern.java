package org.list;

public class Pattern {
	
	public static void main(String[] args) {
		int i=5;
		for (int j = 0; j < i; j++) {
			for (int k = 0; k < i-j; k++) {
				System.out.print("  ");
			}
			for (int l = 0; l <= j; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int j = 0; j < i; j++) {
			for (int k = 0; k <= i; k++) {
				System.out.print("  ");
			}
			for (int l = i-j; l > 0; l--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
