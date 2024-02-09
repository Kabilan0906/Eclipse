package org.function;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value");
		String j = scanner.nextLine();
		for (int k = 0; k < j.length(); k++) {
			char p = j.charAt(k);
			switch (p) {
			case 'A': {
				System.out.print('@');
				break;
			}
			case 'a': {
				System.out.print('@');
				break;
			}
			case 'E': {
				System.out.print('@');
				break;
			}
			case 'e': {
				System.out.print('@');
				break;
			}
			case 'I': {
				System.out.print('@');
				break;
			}
			case 'i': {
				System.out.print('@');
				break;
			}
			case 'O': {
				System.out.print('@');
				break;
			}
			case 'o': {
				System.out.print('@');
				break;
			}
			case 'U': {
				System.out.print('@');
				break;
			}
			case 'u': {
				System.out.print('@');
				break;
			}
			default: {
				System.out.print(p);
			}
			}
		}
		System.out.println();
		scanner.close();
	}

}
