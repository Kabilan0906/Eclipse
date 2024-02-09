package org.colle;

import java.util.ArrayList;
import java.util.List;

public class Remove {
	public static void main(String[] args) {
		int[] i = {10,20,30,40,50,60,70,80};
		int[] j = {10,200,300,400,500,600,700,8000};
		List<Integer> data1 = new ArrayList<Integer>();
		for (Integer x : i) {
			data1.add(x);
		}
		System.out.println("Input first value :"+data1);
		List<Integer> data2 = new ArrayList<Integer>();
		for (Integer y : j) {
			data2.add(y);
		}
		System.out.println("Input second value :"+data2);
		data1.removeAll(data2);
		System.out.println("Output value :"+data1);

	}

}
