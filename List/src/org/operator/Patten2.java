package org.operator;

public class Patten2 {
	public static void main(String[] args) {
		int rows = 7;
		for (int i = rows; i >=0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <=rows-i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
