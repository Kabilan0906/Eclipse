package org.list;

import java.util.Scanner;

public class Testing1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Employee id");
		int empId = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Employee Name");
		String empName = scanner.nextLine();
		System.out.println("Enter the Employee Email");
		String empEmail = scanner.nextLine();
		System.out.println("Enter the Employee Phone No");
		long empPhoneNo = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter the Employee Salary");
		float empSalary = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Enter the Employee Genter");
		String empGender = scanner.nextLine();
		System.out.println("Enter the Employee City");
		String empCity = scanner.nextLine();
		
		System.out.println("Emp Id:"+empId);
		System.out.println("Emp Name:"+empName);
		System.out.println("Emp Email:"+empEmail);
		System.out.println("Emp Phone No:"+empPhoneNo);
		System.out.println("Emp Salary:"+empSalary);
		System.out.println("Emp Gender:"+empGender);
		System.out.println("Emp City:"+empCity);
		scanner.close();
	}
}

