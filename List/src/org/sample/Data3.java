package org.sample;

public class Data3 extends Data2 {
	public void type() {
		System.out.println("Data 3");
	}
	public static void main(String[] args) {
		Data2 data = new Data2();
		data.type();
	}
}
