package org.function;

public class BreakNextLoop {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 4; k++) {
					System.out.println("i = " + i + " j = " + j + " k = " + k);
					if (i == 4 & j == 1 & k == 0) {
						break;
					}
				}
				if (i == 4 & j == 1) {
					break;
				}
			}
			if (i == 4) {
				break;
			}
		}
	}
}
