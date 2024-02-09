package org.operator;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the real number");
		int i = scanner.nextInt();
		int k = 1;
		for (int j = 1; j <= i; j++) {
			k = k * j;
		}
		System.out.println(k);
		scanner.close();
	}

//	static int factorial(int n) {
//		if (n == 1)
//			return 1;
//		else
//			return (n*factorial(n - 1));
//	}
//
//	public static void main(String[] args) {
//		System.out.println("Factorial of 5 is: " + factorial(5));
//	}

//	factorial(5) 
//	   factorial(4) 
//	      factorial(3) 
//	         factorial(2) 
//	            factorial(1) 
//	            return 1 
//	         return 2*1 = 2 
//	      return 3*2 = 6 
//	   return 4*6 = 24 
//	return 5*24 = 120
}
