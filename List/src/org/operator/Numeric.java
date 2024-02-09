package org.operator;

import java.util.Arrays;

public class Numeric {
	public static void main(String[] args) {
		String s="#1a3b2c%",p="";
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			if (Character.isDigit(c)) {
				p=p+String.valueOf(c);
			}
		}
		char[] x=p.toCharArray();
		Arrays.sort(x);
		p="";
		for (char c : x) {
			p=p+String.valueOf(c);
		}
		StringBuilder sb=new StringBuilder(p);
		System.out.println(sb.reverse());
		
		
	}
}
