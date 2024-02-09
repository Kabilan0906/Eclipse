package org.function;

import java.util.Scanner;

public class Wordl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the small letter name");
		String name = scanner.nextLine();
		String result = name.toUpperCase();
		System.out.println(result);
		scanner.close();
	}

}
