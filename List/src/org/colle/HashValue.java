package org.colle;

import java.util.HashSet;
import java.util.Set;

public class HashValue {
	public static void main(String[] args) {
		int[] i= {10,20,30,40,50,60,70,80,90,10,20};
		Set<Integer> data1 = new HashSet<Integer>();
		for (int j : i) {
			data1.add(j);
		}
		System.out.println("HashSet :"+data1);

	}

}
