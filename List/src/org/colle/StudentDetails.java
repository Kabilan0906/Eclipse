package org.colle;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Map<String, Object>> map = new LinkedHashMap<>();
		for (int i = 1; i <= 10; i++) {
			System.out.print("Enter the id : ");
			String id = scanner.nextLine();
			System.out.print("Enter the name : ");
			String name = scanner.nextLine();
			System.out.print("Enter the phone : ");
			String phone = scanner.nextLine();
			System.out.print("Enter the address : ");
			String address = scanner.nextLine();
			System.out.print("Enter the dob : ");
			String dob = scanner.nextLine();
			System.out.print("Enter the email : ");
			String email = scanner.nextLine();
			System.out.print("Enter the gender : ");
			String gender = scanner.nextLine();
			scanner.nextLine();
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("Student Id", id);
			data.put("Student Name", name);
			data.put("Student Phone", phone);
			data.put("Student Address", address);
			data.put("Student DOB", dob);
			data.put("Student Email", email);
			data.put("Student Gender", gender);
			map.put(i, data);
		}
		for (Map.Entry<Integer, Map<String, Object>> x : map.entrySet()) {
			System.out.println("Employee Number :" + x.getKey());
			Map<String, Object> detail = x.getValue();
			for (Map.Entry<String, Object> y : detail.entrySet()) {
				System.out.println(y.getKey() + ":" + y.getValue());
			}
			System.out.println();
		}
		scanner.close();
	}
}
