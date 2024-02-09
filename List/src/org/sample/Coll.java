package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Coll {
	public static void main(String[] args) {
		List<Object> al = new ArrayList<>();
		al.add('d');
		al.add(20.00f);
		al.add(30l);
		al.add(40d);
		al.add("40");
		al.add(40);
		al.add(50);
		Object[] data = al.toArray();
		for (Object x : data) {
			System.out.println(x);
		}
		System.out.println(data);
	}

}
