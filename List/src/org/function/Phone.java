package org.function;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the phone number");
		String phoneNumber = scanner.nextLine();
		String pattern = "^[6-9]\\d{9}$";
//		String pattern="^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@"
//				+ "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern phone = Pattern.compile(pattern);
		Matcher match = phone.matcher(phoneNumber);
		System.out.println(match.find());
//		if(match.matches())
//			System.out.println("Phone number is valid");
//		else
//			System.out.println("Phone number is invalid");
		scanner.close();
	}

}
