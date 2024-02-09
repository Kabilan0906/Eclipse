package org.list;

public class InitializerParent {

	public InitializerParent() {
		System.out.println("Parent constructor");
	}
	
	{
		System.out.println("Parent initializer");
	}
}
