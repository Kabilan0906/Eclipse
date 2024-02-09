package org.operator;

public class Patten1 {
	public static void main(String[] args) {
		int i=7;int y = 1;
		for(int j=1; j<=i; j++) {
			for(int k=1; k<=j; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int j=1; j<=i; j++) {
			for(int k=1; k<=j; k++) {
				System.out.print(y+" ");
				y++;
			}
			System.out.println();
		}
	}

}
