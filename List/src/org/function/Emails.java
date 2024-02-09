package org.function;

import java.util.Scanner;

public class Emails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the email :");
		String email = scanner.nextLine();
		boolean check = email.contains("@");
		System.out.println("Email is :"+check);
		scanner.close();
	}

}
