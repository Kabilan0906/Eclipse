package org.fileInJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteRead {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\KABILAN\\Downloads\\Sample\\Test.txt";
		File newFile = new File(filePath);
		try {
			FileWriter writer = new FileWriter(newFile);
			writer.write("First Line");
			writer.write("This is a first Line");
			writer.flush();
			try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
				bufferedWriter.newLine();
				bufferedWriter.append("Second line");
				bufferedWriter.append(" This is a second line");
				bufferedWriter.newLine();
				bufferedWriter.write("Third line");
				bufferedWriter.flush();
			}
			FileReader reader = new FileReader(newFile);
			try (BufferedReader bufferedReader = new BufferedReader(reader)) {
				String result = bufferedReader.readLine();
				while (result != null) {
					System.out.println(result);
					result = bufferedReader.readLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
