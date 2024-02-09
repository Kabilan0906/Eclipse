package org.colle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicate {
	public static void main(String[] args) {
		Integer a[] = { 10, 10, 50, 60, 80, 60, 50, 20 };
		Arrays.sort(a);
		List<Integer> data = new ArrayList<Integer>(Arrays.asList(a));
//		for (int set : a) {
//			data.add(set);
//		}
		System.out.println(data);
		for (int i = 0; i < data.size(); i++) {
			for (int j = i + 1; j < data.size(); j++) {
				if (data.get(i) == data.get(j)) {
					data.remove(j);
				} else {
					continue;
				}
			}
		}
		System.out.println(data.toString());
//		Set<Integer> set = new LinkedHashSet<Integer>(data);
//		System.out.println(set);

	}

}
