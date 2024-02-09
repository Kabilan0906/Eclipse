package org.function;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value");
		String i = scanner.nextLine();
		String j = i.substring(0,7);
		System.out.println(j);
		scanner.close();
	}

}
