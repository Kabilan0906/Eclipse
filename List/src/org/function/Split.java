package org.function;

public class Split {
	public static void main(String[] args) {
		String i = "Welcome to java class";
		System.out.println("Split by space");
		String[] j = i.split(" ");
		for (String space : j) {
			System.out.println(space);
		}
		System.out.println("Split by 'l'");
		String[] k = i.split("l");
		for (String l : k) {
			System.out.println(l);
		}
	}

}
