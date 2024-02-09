package org.colle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Data {
	public static void main(String[] args) {
		Map<Integer, String> mu = new HashMap<>();
		mu.put(1, "one");
		mu.put(4, "four");
		mu.put(2, "two");
		mu.put(4, "four");
		mu.put(3, "three");
		Set<Integer> keySet = mu.keySet();
		System.out.println(keySet);
		Collection<String> x = mu.values();
		System.out.println(x);
		System.out.println(mu.get(2));
	}
}
