package org.sample;

public class D extends A{
	public void sub() {
		System.out.println("D");
	}
	public static void main(String[] args) {
		D d = new D();
		d.sub();
	}

}