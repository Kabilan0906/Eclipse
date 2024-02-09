package org.operator;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the your age");
		int age=scanner.nextInt();
		if(age>=18)
			System.out.println("Eligible to vote");
		else 
			System.out.println("Not eligible to vote");
		scanner.close();
	}

}
