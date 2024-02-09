package org.colle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Com {
	public static void main(String[] args) {
		List<Integer> data1 = new ArrayList<>();
		data1.add(10);
		data1.add(20);
		data1.add(30);
		data1.add(40);
		data1.add(50);
		data1.add(60);
		data1.add(70);
		data1.add(80);
		List<Integer> data2 = new ArrayList<>();
		data2.add(10);
		data2.add(200);
		data2.add(300);
		data2.add(400);
		data2.add(500);
		data2.add(600);
		data2.add(700);
		data2.add(800);
		data2.add(900);
		Set<Integer> data3 = new HashSet<Integer>(data1);
		data3.retainAll(data2);
		System.out.println(data3+"\n");
		Object[] array = data1.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
	}

}
