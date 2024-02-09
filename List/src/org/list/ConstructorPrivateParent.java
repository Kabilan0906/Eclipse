package org.list;

public class ConstructorPrivateParent {

//	if you declare private constructor in class doesn't inheritance 
	private ConstructorPrivateParent() {
		System.out.println("Parent constructor");
	}
	
	public ConstructorPrivateParent getConstructorPrivateParent() {
		return getConstructorPrivateParent();
	}
	
	public static void Data() {
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		new ConstructorPrivateParent();
		Data();
	}
}
