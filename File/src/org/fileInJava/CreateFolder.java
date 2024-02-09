package org.fileInJava;

import java.io.File;

public class CreateFolder {
	public static void main(String[] args) {
		File file = new File("C:/Users/KABILAN/Downloads/Sample/A/B/C");
		if (file.exists()&& file.isDirectory()) {
			System.out.println("Directory is available");
		}else {
			if (file.mkdirs()) {
				System.out.println("Directory created is successfully");
			} else {
				System.out.println("Directory created is not successfully");
			}
		}
	}
}
