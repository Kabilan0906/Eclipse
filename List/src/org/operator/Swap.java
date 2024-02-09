package org.operator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Swap {
	public static void main(String[] args) {
		int[] x= {22,11,33};
		Integer[] y=new Integer[x.length];
		for (int i = 0; i < x.length; i++) {
			y[i]=x[i];
		}
		List<Integer> asList = Arrays.asList(y);
		Collections.swap(asList, 0, 1);
		System.out.println(asList);
		Collections.sort(asList, Collections.reverseOrder());
		System.out.println(asList);
	}
}
