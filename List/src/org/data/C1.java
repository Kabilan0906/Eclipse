package org.data;

public class C1 extends C2 implements C3 {
	public C1() {
		super();
		System.out.println("Child class constructor");
	}
	@Override
	public void add() {
		System.out.println("Add");
	}
	public static void main(String[] args) {
		C1 c = new C1();
		c.Sub();
		c.add();
	}
	
}
