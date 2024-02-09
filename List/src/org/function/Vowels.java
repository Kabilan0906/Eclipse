package org.function;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value");
		String j = scanner.nextLine();
		String data = j.toLowerCase();
		char a='a', e='e', i='i', o='o', u='u';
		int vowels=0, consonant=0;
		for (int k = 0; k < data.length(); k++) {
			char l = data.charAt(k);
			if(l==a||l==e||l==i||l==o||l==u) {
				vowels++;
			}else {
				consonant++;
			}
		}
		System.out.println("Vowels ="+vowels);
		System.out.println("Consonant"+consonant);
		scanner.close();
	}

}
