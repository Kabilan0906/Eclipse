package org.operator;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the natural number");
		int i = scanner.nextInt();
		scanner.nextLine();
		int number, remainter, rev = 0;
		number = i;
		while (number > 0) {
			remainter = number % 10;
			rev = (rev * 10) + remainter;
			number /= 10;
		}
		if (i == rev)
			System.out.println(i + " is a palindrome number");
		else
			System.out.println(i + " is a not palindrome number");
		scanner.close();

	}

}
