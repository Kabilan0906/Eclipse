package org.operator;

import java.util.Scanner;

public class SumOfTheNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the natural number");
		int i=scanner.nextInt();
		int remainter,result=0;
		System.out.println("Sum of the number");
		while(i !=0) {
			remainter=i%10;
			result += remainter;
			i /= 10;
		}
		System.out.println(result);
		scanner.close();
	}

}
