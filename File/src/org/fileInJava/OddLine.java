package org.fileInJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class OddLine {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader
				(new FileReader("C:\\Users\\KABILAN\\Downloads\\Sample\\Test.txt"))){
			Map<Integer, String> map = new TreeMap<Integer, String>();
			int count=0;String line;
			while ((line=reader.readLine()) !=null) {
				count++;
				map.put(count, line);
			}
			Set<Entry<Integer, String>> x=map.entrySet();
			for (Entry<Integer, String> y : x) {
				if (y.getKey()%2==1) {
					System.out.println(y.getValue());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
