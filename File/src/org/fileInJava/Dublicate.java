package org.fileInJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Dublicate {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\KABILAN\\Downloads\\Sample\\Para.txt"))) {
			Map<String, Integer> map = new TreeMap<>();
			String line;
			int count = 0;
			while ((line = reader.readLine()) != null) {
				String[] s = line.split(" ");
				for (String x : s) {
					if (map.containsKey(x)) {
						map.put(x, map.get(x) + 1);
						count++;
					} else {
						map.put(x, 1);
					}
				}
			}
			System.out.println("Count of the dublicate word in this file : " + count);
			Set<Entry<String, Integer>> entry = map.entrySet();
			for (Entry<String, Integer> y : entry) {
				if (y.getValue() > 1) {
					System.out.println(y.getKey() + " : " + y.getValue());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
