package org.function;

import java.util.Scanner;

public class Empty {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the address");
		String address = scanner.nextLine();
		if(address.contains("pincode")) {
			String result = address.replace("pincode", "");
			System.out.println(result);
		}
		else {
			System.out.println("No change needed :"+address);
		}
		scanner.close();
	}

}
