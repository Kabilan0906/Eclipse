package org.sample;

public class Data5 implements Data4 {

	@Override
	public void div() {
		System.out.println("Abstract div");
		
	}
	public static void main(String[] args) {
		Data5 data5 = new Data5();
		data5.add();
		data5.div();
	}


}
