package org.function;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the email id");
		String email = scanner.nextLine();
		if(email.contains("@")){
			System.out.println("Valid email id");
		}
		else{
			System.out.println("Invalid email id ");
		}
		scanner.close();
	}

}
