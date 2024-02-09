package org.fileInJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\KABILAN\\Downloads\\Sample\\Test.txt";
		File newFile = new File(filePath);
		try {
			if (newFile.createNewFile()) {
				System.out.println("File create successfully");
			} else {
				System.out.println("File does not create successfully");
			}
			FileWriter write = new FileWriter(newFile);
			try (BufferedWriter Writer = new BufferedWriter(write)) {
				Writer.write("One");
				Writer.newLine();
				Writer.write("Two");
				Writer.newLine();
				Writer.write("Three");
				Writer.newLine();
				Writer.write("Four");
				Writer.newLine();
				Writer.write("Five");
				Writer.newLine();
				Writer.write("Six");
				Writer.newLine();
				Writer.write("Seven");
				Writer.newLine();
				Writer.write("Eight");
				Writer.newLine();
				Writer.write("Nine");
				Writer.newLine();
				Writer.write("Ten");
				Writer.flush();
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

		}
	}

}




//if (newFile.delete()) {
//System.out.println("File delete successfully");
//} else {
//System.out.println("File does not delete successfully");
//}