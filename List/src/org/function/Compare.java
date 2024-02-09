package org.function;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string value");
		String i = scanner.nextLine();
		System.out.println("Enter the second string value");
		String j = scanner.nextLine();
		int k= i.compareTo(j);
		System.out.println("Comparing "+i+" and "+j+" : "+k);
		scanner.close();
	}

}
