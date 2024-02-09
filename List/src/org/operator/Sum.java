package org.operator;

public class Sum {
	public static void main(String[] args) {
		int i=0;
		for(int j=1;j<=100;j++) {
			if(j%2==0) {
				continue;
			}
			else {
				i=i+j;
			}
		}
		System.out.println("Sum of the odd number = "+i);
	}

}
