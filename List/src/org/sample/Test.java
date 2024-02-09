package org.sample;

import java.util.Scanner;

public class Test {
	static int length = 0, last = 0, first = 0, inside = 0, p = 1, f = 0;
	static String str = "", res = " ";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value");
		String a = scanner.nextLine();
		try {
			for (int i = 0; i < p; i++) {
				a.charAt(i);
				length++;
				p++;
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Length of String : " + length);
		}p=0;
		for (int i = 0; i < length; i++) {
			if (a.charAt(i) == ' ') {
				first++;
				continue;
			} else {
				break;
			}
		}
		System.out.println(first);
		for (int i = length - 1; i > 0; i--) {
			if (a.charAt(i) == ' ') {
				last++;
				continue;
			} else {
				break;
			}
		}
		System.out.println(last);
		for (int i = first; i < length - last; i++) {
			int j = i + 1;
			if (a.charAt(i) == ' ' && a.charAt(j) == ' ') {
				inside++;
				continue;
			} else if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z')
					&& a.charAt(j) == ' ') {
				res += a.charAt(i);
			} else if (a.charAt(i) == ' '
					&& (a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z')) {
				res += a.charAt(i);
			} else if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z')
					&& (a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z')) {
				res += a.charAt(i);
			}

		}
		System.out.println(res);
		length = length - (first + last + inside);
		f = length;
		for (int i = length; i >= 0; i--) {
			if (res.charAt(i) == ' ') {
				if (p > 0) {
					str += res.charAt(i);
				}
				for (int j = i + 1; j <= f; j++) {
					str += res.charAt(j);
				}
				p++;
				System.out.println(last);
				f = i - 1;
			} else {
				continue;
			}
		}
		System.out.println(str);
		scanner.close();
	}
}
