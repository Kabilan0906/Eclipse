package org.function;

import java.util.Scanner;

public class Equals {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first input");
		String input1 = scanner.nextLine();
		System.out.println("Enter the second input");
		String input2 = scanner.nextLine();
		if(input1.equalsIgnoreCase(input2)) {
			System.out.println("input are equal");
		}
		else {
			System.out.println("input are not equal");
		}
		scanner.close();
	}

}
