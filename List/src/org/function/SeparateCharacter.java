package org.function;

import java.util.Arrays;

public class SeparateCharacter {

	public static void main(String[] args) {
		String s = "aaaabbbbccaabbcccc";
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		s=String.valueOf(Arrays.asList(charArray).iterator().next());
		StringBuilder currentGroup = new StringBuilder
				(String.valueOf(s.charAt(0)));
		for (int i = 1; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if (currentChar == s.charAt(i - 1)) {
				currentGroup.append(currentChar);
			} else {
				System.out.println(currentGroup);
				currentGroup = new StringBuilder
						(String.valueOf(currentChar));
			}
		}
		System.out.println(currentGroup);
	}
}
