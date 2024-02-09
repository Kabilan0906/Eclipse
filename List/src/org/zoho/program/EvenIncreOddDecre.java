package org.zoho.program;

public class EvenIncreOddDecre {

	public static void main(String[] args) {
		int[] a= {8,2,7,3,4,9,5,6,1,0};
		int[] b=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					a[j] = a[j] + a[i];
					a[i] = a[j] - a[i];
					a[j] = a[j] - a[i];
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (a[i]%2==0) 
				b[i]=a[i];
			if(a[i]%2 !=0 && i==0)
				b[b.length-1]=a[i];
			if(a[i]%2 !=0 && i!=0)
				b[b.length-i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
