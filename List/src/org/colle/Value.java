package org.colle;

import java.util.ArrayList;
import java.util.List;

public class Value {
	static int i = 0;

	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(90);
		data.add(10);
		data.add(10);
		data.add(40);
		data.add(50);
		data.add(30);
		for (Integer j : data) {
			if (j == 10) {
				data.set(i, 100);
				i++;
			} else {
				i++;
			}
		}
		System.out.println(data);
	}

}
