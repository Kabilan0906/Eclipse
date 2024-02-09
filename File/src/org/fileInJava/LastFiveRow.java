package org.fileInJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LastFiveRow {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\KABILAN\\Downloads\\Sample\\Test.txt"))) {
			Map<Integer, String> map = new TreeMap<Integer, String>();
			int count = 0, i = 0;
			String line;
			while ((line = reader.readLine()) != null) {
				count++;
				map.put(count, line);
			}
			i = count - 5;
			Set<Entry<Integer, String>> entry = map.entrySet();
			for (Entry<Integer, String> x : entry) {
				if (x.getKey() > i) {
					System.out.println(x.getValue());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class LastFiveRow {
//	public static void main(String[] args) {
//		String str="C:\\Users\\KABILAN\\Downloads\\Sample\\Test.txt";
//		int x=5;
//		List<String> lastLine =readLastLines(str,x);
//		for (String line : lastLine) {
//			System.out.println(line);
//		}
//	}
//
//	private static List<String> readLastLines(String str, int x) {
//		List<String> lastLines = new ArrayList<String>();
//		try (BufferedReader reader = new BufferedReader(new FileReader(str))){
//			String line;
//			List<String> buffer= new ArrayList<String>();
//			while ((line=reader.readLine()) !=null) {
//				buffer.add(line);
//				if (buffer.size()>x) {
//					buffer.remove(0);
//				}
//			}
//			lastLines.addAll(buffer);
//		} catch (Exception e) {
//			e.getMessage();
//		}
//		return lastLines;
//	}
//
//}
