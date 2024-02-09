package org.colle;

import java.util.Set;
import java.util.TreeSet;

public class RemoveValue {
	public static void main(String[] args) {
		int[] i= {10,20,30,40,50,60,70,80};
		int[] j= {100,200,300,400,500,600,700,8000};
		Set<Integer> data1 = new TreeSet<Integer>();
		for (int x : i) {
			data1.add(x);
		}
		System.out.println("I TreeSet :"+data1);
		Set<Integer> data2 = new TreeSet<Integer>();
		for (int y : j) {
			data2.add(y);
		}
		System.out.println("II TreeSet :"+data2);
		data1.removeAll(data2);
		System.out.println("Use removeAll() method :"+data1);
	}

}
