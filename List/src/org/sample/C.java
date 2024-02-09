package org.sample;

public class C {
	public static void main(String[] args) {
		B b = new B();
		System.err.println(b.a);
		A b1 = new A();
		System.err.println(b1.a);
		A b2 = new B();
		System.err.println(b2.a);
	}
}
