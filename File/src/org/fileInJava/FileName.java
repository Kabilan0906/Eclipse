package org.fileInJava;

import java.io.File;

public class FileName {
	public static void main(String[] args) {
		File files = new File
				("C:\\Users\\KABI\\Kabil");
		File[] fr= files.listFiles();
		for (File x : fr) {
			System.out.println(x.getName());
		}
		System.out.println(files.getName());
		System.out.println(files.getPath());
		System.out.println(files.getClass());
		System.out.println(files.isFile());
		System.out.println(files.isDirectory());
		System.out.println(files.isAbsolute());
		System.out.println(files.canRead());
		System.out.println(files.canExecute());
	}

}
