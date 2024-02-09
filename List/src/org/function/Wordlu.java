package org.function;

import java.util.Scanner;

public class Wordlu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = scanner.nextLine();
		for (int i = 0; i < name.length(); i++) {
			char j = name.charAt(i);
			if(j >= 'A' && j <= 'Z') {
				String k = j+"";
				String l = k.toLowerCase();
				System.out.print(l);
			}else if (j >= 'a' && j <='z') {
				String k = j+"";
				String l = k.toUpperCase();
				System.out.print(l);
			}

		}
		System.out.println();
		scanner.close();
	}

}
