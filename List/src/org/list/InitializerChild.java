package org.list;

public class InitializerChild extends InitializerParent{
 
	public InitializerChild() {
		System.out.println("Child constructor");
	}
	{
		System.out.println("Child initializer");
	}
	public static void main(String[] args) {
		new InitializerChild();
	}
}
