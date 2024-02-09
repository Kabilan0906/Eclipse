 package org.operator;

import java.util.Scanner;

public class CountOfTheNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the natural number");
		String i=scanner.nextLine();
		int j=i.length();
		System.out.println("Count of the number :"+j);
		scanner.close();
	}

}
