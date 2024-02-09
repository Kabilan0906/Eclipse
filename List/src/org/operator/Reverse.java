package org.operator;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the natural number : Reverse the number");
		int i = scanner.nextInt();
		scanner.nextLine();
		while (i != 0) {
			int remainter = i % 10;
			System.out.print(remainter);
			i = i / 10;
		}
		System.out.println();
		scanner.nextLine();

		System.out.println("Enter the word : Reverse the string");
		String a = scanner.nextLine();
		for (int j = a.length() - 1; j >= 0; j--) {
			char name = a.charAt(j);
			System.out.print(name);
		}
		System.out.println();
		scanner.nextLine();

		System.out.println("Enter the line : Reverse the individual word");
		String word = scanner.nextLine();
		String[] x = word.split(" ");
		for (String l : x) {
			for (int k = l.length() - 1; k >= 0; k--) {
				char name = l.charAt(k);
				System.out.print(name);
			}
			System.out.print(" ");
		}
		System.out.println();
		scanner.nextLine();

		System.out.println("Enter the line : Reverse word");
		String line = scanner.nextLine();
		String[] y = line.split(" ");
		for (int j = y.length - 1; j >= 0; j--) {
			System.out.print(y[j]+" ");
		}
		System.out.println();
		scanner.nextLine();
		
		System.out.println("Enter the line : Reverse word & letter");
		String lines = scanner.nextLine();
		String[] z = lines.split(" ");
		for (int j = z.length - 1; j >= 0; j--) {
			String k = z[j];
			for (int j1 = k.length() - 1; j1 >= 0; j1--) {
				char o = k.charAt(j1);
				System.out.print(o);
			}
			System.out.print(" ");
		}
		System.out.println();
		scanner.nextLine();
		scanner.close();
	}

}
