package org.colle;

import java.util.Map;
import java.util.TreeMap;

public class MapHLT {
	public static void main(String[] args) {
		Map<Character,Integer> map =new TreeMap<>();
		map.put('!', 10);
		map.put('@', 20);
		map.put('#', 30);
		map.put('$', 40);
		map.put('%', 50);
		map.put('^', 60);
		map.put('&', 10);
		map.put('*', 50);
		map.put('(', 409);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
				
	}

}
