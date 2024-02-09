package org.function;

import java.util.Scanner;

public class CountOfChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String input = scanner.nextLine();
		int lower = 0, upper = 0, number = 0, special = 0, space = 0;
		for (int i = 0; i < input.length(); i++) {
			char k = input.charAt(i);
			if (k >= 'A' && k <= 'Z') {
				upper += 1;
			} else if (k >= 'a' && k <= 'z') {
				lower += 1;
			} else if (k >= '0' && k <= '9') {
				number++;
			} else if (k == ' ') {
				space++;
			} else {
				special++;
			}
		}
		System.out.println("UpperCase :" + upper);
		System.out.println("LowerCase :" + lower);
		System.out.println("Number :" + number);
		System.out.println("Space :" + space);
		System.out.println("Special :" + special);
		scanner.close();

		char[] x = input.toCharArray();
		int let = 0, spa = 0, num = 0, sym = 0;
		for (char c : x) {
			if (Character.isLetter(Character.valueOf(c))) {
				let++;
			} else if (Character.isSpaceChar(Character.valueOf(c))) {
				spa++;
			} else if (Character.isDigit(Character.valueOf(c))) {
				num++;
			} else {
				sym++;
			}
		}
		System.out
				.println("letter :" + let + "\n" + "space :" + spa + "\n" + "number :" + num + "\n" + "symbol :" + sym);
	}
}
