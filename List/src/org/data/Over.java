package org.data;

public class Over {
	public void add(){
		System.out.println("Add");
	}
	public void add(int a){
		System.out.println("Add value");
	}
	public static void main(String[] args) {
		Over over = new Over();
		over.add();
		over.add(7);
	}

}
