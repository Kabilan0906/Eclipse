package org.function;

public class StackOver {

	static void data() {
		System.out.println("Constructor");
		data();
	}

	public static void main(String[] args) {
		data();
	}
//	Exception in thread "main" java.lang.StackOverflowError

}
