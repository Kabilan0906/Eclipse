package org.colle;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDetails {
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
			System.out.print("Enter the doj : ");
			String doj = scanner.nextLine();
			System.out.print("Enter the email : ");
			String email = scanner.nextLine();
			System.out.print("Enter the gender : ");
			String gender = scanner.nextLine();
			System.out.print("Enter the salary : ");
			Double salary = scanner.nextDouble();
			scanner.nextLine();
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("Employee Id", id);
			data.put("Employee Name", name);
			data.put("Employee Phone", phone);
			data.put("Employee Address", address);
			data.put("Employee DOB", dob);
			data.put("Employee DOJ", doj);
			data.put("Employee Email", email);
			data.put("Employee Gender", gender);
			data.put("Employee Salary", salary);
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
