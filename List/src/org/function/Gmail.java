package org.function;

import java.util.Scanner;

public class Gmail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the gmail");
		String gmail = scanner.nextLine();
		if(gmail.contains(gmail)) {
		String result = gmail.replace("gmail", "yahoo");
		System.out.println(result);
		}
		else{
			System.out.println("No change needed :"+gmail);
		}
		scanner.close();
	}

}
