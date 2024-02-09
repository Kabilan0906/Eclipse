package org.function;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Pincode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the address");
		String address = scanner.nextLine();
		String pattern = "^[6-9][0-9]{2}\\s?[0-9]{3}$";
		Pattern pincode = Pattern.compile(pattern);
		String[] one = address.split(",");
		int i = 0;
		for (String x : one) {
			Matcher match = pincode.matcher(x);
			boolean j = match.matches();
			if (j == false) {
				continue;
			} else {
				i++;
				break;
			}
		}
		if (i == 1)
			System.out.println("Valid address");
		else
			System.out.println("Invalid address");
		scanner.close();
	}

}