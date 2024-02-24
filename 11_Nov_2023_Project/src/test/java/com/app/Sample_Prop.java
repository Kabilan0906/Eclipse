package com.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Sample_Prop {

	public static void read_Data() {

		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Oct_2023_Project"
					+ "\\src\\test\\resources\\TestData\\config.properties");
			FileReader read = new FileReader(f);
			Properties prop = new Properties();
			prop.load(read);
			String property = prop.getProperty("username");
			System.out.println(property);
			String pass = prop.getProperty("password");
			System.out.println(pass);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String prop_reuse(String data) {
		String value = null;
		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Oct_2023_Project"
					+ "\\src\\test\\resources\\TestData\\config.properties");
			FileReader read = new FileReader(f);
			Properties prop = new Properties();
			prop.load(read);
			value= prop.getProperty(data);
			System.out.println(value);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

	public static void main(String[] args) {
		prop_reuse("username");
		prop_reuse("password");
	}

}
