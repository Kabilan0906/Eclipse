package org.function;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string value");
		String i = scanner.nextLine();
		boolean j = i.startsWith("Welcome");
		System.out.println(j);
		scanner.close();
	}

}
