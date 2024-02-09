package org.operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodCollections {
	public static void main(String[] args) {
		Integer[] x= {8,7,0,9,4,6,1,5,2,3};
		System.out.println("Array : "+Arrays.toString(x));
		Arrays.sort(x);
		System.out.println("Arrays sort : "+Arrays.toString(x));
		Collections.reverse(Arrays.asList(x));
		System.out.println("Array reverse : "+Arrays.toString(x)+"\n");
		
		Integer[] y= {8,7,0,9,4,6,1,5,2,3};
		List<Integer> arrlist=Arrays.asList(y);
		System.out.println("ArrayList : "+arrlist);
		Collections.sort(arrlist,Collections.reverseOrder());
		System.out.println("ArrayList sort & reverse order: "+arrlist);
		int binarySearch = Collections.binarySearch(arrlist, 0);
		System.out.println("\n"+"Binary search "+binarySearch);
		Collections.rotate(arrlist, 3);
		System.out.println("rotate "+arrlist);
		
		Integer[] z={2,8,4,2,5,3,2};
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(z));
		int frequency = Collections.frequency(list, 2);
		System.out.println("Frequency "+frequency);
		Integer max = Collections.max(list);
		System.out.println("Max "+max);
		Integer min = Collections.min(list);
		System.out.println("Min "+min);
		
		Integer[] w= {11,22,33};
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(w));
		boolean disjoint = Collections.disjoint(list, arrayList);
		System.out.println("Disjoint "+disjoint);
	}
}
