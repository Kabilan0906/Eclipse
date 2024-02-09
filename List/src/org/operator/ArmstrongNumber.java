package org.operator;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the real value");// 153
		int i = scanner.nextInt();
		scanner.nextLine();

//		String j=String.valueOf(i);
//		double k=j.length();
//		int orginalnumber,remainter,result=0;
//		orginalnumber=i;
//		while(orginalnumber !=0) {
//			remainter=(orginalnumber%10);
//			result+=Math.pow(remainter,k);
//			orginalnumber/=10;
//		}

		double length = 0;
		int j = 0, k = 0, result = 0;
		k = i;
		while (k > 0) {
			k = k / 10;
			length++;
		}
		k = i;
		while (k > 0) {
			j = (k % 10);
			result += Math.pow(j, length);
			k = k / 10;
		}
		if (i == result)
			System.out.println(i + " is an Armstrong number");
		else
			System.out.println(i + " is an not Armstrong number");
		scanner.close();
	}

}
