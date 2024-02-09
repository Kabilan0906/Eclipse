package org.function;

import java.util.Scanner;

public class Equal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first input");
		String input1 = scanner.nextLine();
		System.out.println("Enter the second input");
		String input2 = scanner.nextLine();
		if(input1.equals(input2)) {
			System.out.println("Inputs are equal");
		}
		else {
			System.out.println("Inputs are not equal");
		}
		scanner.close();
	}

}
