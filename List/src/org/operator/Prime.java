package org.operator;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the real value");
		int a=scanner.nextInt();
		boolean b=false;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				b=true;
				break;
			}
		}
		if(!b)
			System.out.println(a+" is a prime number");
		else
			System.out.println(a+" is a complex number");
		scanner.close();
	}
}
