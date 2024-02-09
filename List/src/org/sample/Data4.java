package org.sample;

public interface Data4 {
	default void add() {
		System.out.println("Stream default");
	}
	private void sub() {
		System.out.println("Stream private");
	}
	static void mul() {
		System.out.println("Stream static");
	}
	void div();
	public static void main(String[] args) {
		mul();
	}
}