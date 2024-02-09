package org.operator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate {
	public static void main(String[] args) {
		String data = "welcome to all";
		char[] x = data.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char y : x) {
			Character c = Character.valueOf(y);
			if (Character.isLetter(c)) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
		}
		Set<Entry<Character, Integer>> result = map.entrySet();
		for (Entry<Character, Integer> entry : result) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
		}
	}

}
