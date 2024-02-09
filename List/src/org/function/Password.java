package org.function;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String s=sc.nextLine();
		System.out.println(Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[^0-9a-zA-Z]).{8}").matcher(s).matches());
		sc.close();
	}
}
