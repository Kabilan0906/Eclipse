package org.sample;

public class Sample {
	public static void main(String[] args) {
		String s ="Aiite";
		
		char charAt = s.charAt(4);
		System.out.println(charAt);
		
		int size = s.length();
		System.out.println(size);
		
		boolean contains = s.contains("t");
		System.out.println(contains);
		
		boolean equal = s.equals("Aiite");
		System.out.println(equal);
		
		boolean equals = s.equalsIgnoreCase("aIITE");
		System.out.println(equals);
		
		boolean startsWith = s.startsWith("A");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("e");
		System.out.println(endsWith);
		
		String sub = s.substring(1, 3);
		System.out.println(sub);
		
		String[] split = s.split("t");
		for (String x : split) {
			System.out.println(x);
		}
	}

}
