package org.data;

import java.util.Arrays;

public class Remove {
	public static void main(String[] args) {
		int s[] = { 10, 20, 10, 90, 30, 30 };
		Arrays.sort(s);
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j]) {
					s[j] = 0;
				}
			}
			if (s[i] != 0) {
				System.out.println(s[i]);
			}
		}
	}
}