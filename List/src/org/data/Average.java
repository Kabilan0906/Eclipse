package org.data;

public class Average {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum +=a[i];
		}
		int avarage=sum/a.length;
		System.out.println(avarage);
	}

}
