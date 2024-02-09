package org.fileInJava;

import java.io.BufferedReader;
import java.io.FileReader;

public class RowCount {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\KABILAN\\Downloads\\Sample\\Test.txt"))) {
			int count = 0;
			while (reader.readLine() != null) {
				count++;
			}
			System.out.println("The row count from the file : " + count);
		} catch (Exception e) {
			e.getMessage();
		}
		try (BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\KABILAN\\Downloads\\Sample\\Test.txt"))) {
			String line;
			boolean contain = false;
			while ((line = reader.readLine()) != null) {
				if (line.contains("java")) {
					contain = true;
					break;
				}
			}
			if (contain) {
				System.out.println("The file contain word java");
			} else {
				System.out.println("The file can't contain word java");
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
