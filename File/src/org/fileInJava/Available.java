package org.fileInJava;

import java.io.File;

public class Available {
	public static void main(String[] args) {
		File directory = new File("C:/Users");
		if (directory.exists()&&directory.isDirectory()) {
			System.out.println("Directory is available");
		}else {
//			if (directory.mkdir()) {
//				System.out.println("Directory is created successfully");
//			} else {
//				System.out.println("Directory is can't created successfully");
//			}
			System.out.println("Directory is not available");
		}
	}
}
