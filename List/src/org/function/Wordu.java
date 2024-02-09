package org.function;

import java.util.Scanner;

public class Wordu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the capital letter name");
		String name = scanner.nextLine();
		String result = name.toLowerCase();
		System.out.println(result);
		scanner.close();
	}

}
