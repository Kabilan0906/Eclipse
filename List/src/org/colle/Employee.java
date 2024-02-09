package org.colle;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
	Scanner scanner = new Scanner(System.in);
	static String name,id,phone,address,dob,doj,gender,email;
	static double salary;static int i=0;
	public static void main(String[] args) {
		Employee employee = new Employee();
		Set<Employee> employeeset = new HashSet<Employee>();
		for (int j = 0; j < 10; j++) {
			System.out.println("Enter employee details:");
			employee.EmployeeName();
			employee.EmployeeId();
			employee.EmployeePhone();
			employee.EmployeeAddress();
			employee.EmployeeDOB();
			employee.EmployeeDOJ();
			employee.EmployeeGender();
			employee.EmployeeEmail();
			employee.EmployeeSalary();
			employeeset.add(employee);
		}
		for (Employee emp : employeeset) {
			i++;
			emp.Result();
		}
	}
	
	public void Result() {
		System.out.println();
		System.out.println("Employee details : " + i);
		System.out.println("Employee Id : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Phone :" + phone);
		System.out.println("Employee Address : " + address);
		System.out.println("Employee Date Of Birth : " + dob);
		System.out.println("Employee DOJ : " + doj);
		System.out.println("Employee Email : " + email);
		System.out.println("Employee Gender : " + gender);
	}

	public void EmployeeName() {
		System.out.println("Enter the name");
		String name = scanner.nextLine();
		Employee.name=name;
	}

	public void EmployeeId() {
		System.out.println("Enter the id");
		String id = scanner.nextLine();
		Employee.id=id;
	}

	public void EmployeeAddress() {
		System.out.println("Enter the address");
		String address = scanner.nextLine();
		Employee.address=address;
	}

	public void EmployeeDOJ() {
		System.out.println("Enter the DOJ");
		String doj = scanner.nextLine();
		Employee.doj=doj;
	}

	public void EmployeeGender() {
		int j = 1;
		for (int i = 0; i < j; i++) {
			System.out.println("Enter the Gender (male or female or other)");
			String gender = scanner.nextLine();
			if(true==gender.equalsIgnoreCase("male")) {
				Employee.gender=gender;
			}else if(true==gender.equalsIgnoreCase("female")) {
				Employee.gender=gender;
			}else if(true==gender.equalsIgnoreCase("other")) {
				Employee.gender=gender;
			}else {
				System.out.println("Invalid entry");
				j++;
			}
		}
	}
	public void EmployeeSalary() {
		System.out.println("Enter the Salary");
		Double salary = scanner.nextDouble();
		Employee.salary=salary;
	}

	public void EmployeeDOB() {
		int day = 0;
		int month = 0;
		int leap = 0;
		int j = 1;
		for (int i = 0; i < j; i++) {
			System.out.println("Enter the date of birth(DD/MM/YYYY)");
			String dob = scanner.nextLine();
			String m = dob.substring(3, 5);
			String d = dob.substring(0, 1);
			String y = dob.substring(6, 10);
			int g = Integer.parseInt(y);
			int year = g % 4;

			switch (d) {
			case "0": {
				day += 1;
				break;
			}
			case "1": {
				day += 1;
				break;
			}
			case "2": {
				day += 1;
				break;
			}
			case "3": {
				day += 2;
				break;
			}
			default:
				day += 3;
			}

			switch (m) {
			case "01": {
				month += 1;
				break;
			}
			case "02": {
				month += 3;
				break;
			}
			case "03": {
				month += 1;
				break;
			}
			case "04": {
				month += 2;
				break;
			}
			case "05": {
				month += 1;
				break;
			}
			case "06": {
				month += 2;
				break;
			}
			case "07": {
				month += 1;
				break;
			}
			case "08": {
				month += 1;
				break;
			}
			case "09": {
				month += 2;
				break;
			}
			case "10": {
				month += 1;
				break;
			}
			case "11": {
				month += 2;
				break;
			}
			case "12": {
				month += 1;
				break;
			}
			default:
				month += 4;
			}

			if (year == 0) {
				leap++;
			}

			switch (month) {
			case 1: {
				switch (day) {
				case 1: {
					String pattern = "^[0-2][0-9]\\/(01|03|05|07|08|10|12)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
					Pattern data = Pattern.compile(pattern);
					Matcher match = data.matcher(dob);
					boolean k = match.matches();
					if (k == true) {
						Employee.dob=dob;
					} else {
						System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
						j++;
					}
					break;
				}

				case 2: {
					String pattern = "^(30|31)\\/(01|03|05|07|08|10|12)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
					Pattern data = Pattern.compile(pattern);
					Matcher match = data.matcher(dob);
					boolean k = match.matches();
					if (k == true) {
						Employee.dob=dob;
					} else {
						System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
						j++;
					}
					break;
				}
				default:
					System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
					j++;
				}
				break;
			}
			case 3: {
				switch (leap) {
				case 0: {
					switch (d) {
					case "0": {
						String pattern = "^[0-2][0-9]\\/(02)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
						Pattern data = Pattern.compile(pattern);
						Matcher match = data.matcher(dob);
						boolean k = match.matches();
						if (k == true) {
							Employee.dob=dob;
						} else {
							System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
							j++;
						}
						break;
					}
					case "1": {
						String pattern = "^[0-2][0-9]\\/(02)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
						Pattern data = Pattern.compile(pattern);
						Matcher match = data.matcher(dob);
						boolean k = match.matches();
						if (k == true) {
							Employee.dob=dob;
						} else {
							System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
							j++;
						}
						break;
					}
					case "2": {
						String pattern = "^(2)[0-8]\\/(02)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
						Pattern data = Pattern.compile(pattern);
						Matcher match = data.matcher(dob);
						boolean k = match.matches();
						if (k == true) {
							Employee.dob=dob;
						} else {
							System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
							j++;
						}
						break;
					}
					default:
						System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
						j++;
					}
					break;

				}
				case 1: {
					switch (day) {
					case 1: {
						String pattern = "^[0-2][0-9]\\/(02)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
						Pattern data = Pattern.compile(pattern);
						Matcher match = data.matcher(dob);
						boolean k = match.matches();
						if (k == true) {
							Employee.dob=dob;
						} else {
							System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
							j++;
						}
						break;
					}
					default:
						System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
						j++;
					}
					break;
				}
				default:
					System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
					j++;
				}
				break;
			}
			case 2: {
				switch (day) {

				case 1: {
					String pattern = "^[0-2][0-9]\\/(02|04|06|09|11)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
					Pattern data = Pattern.compile(pattern);
					Matcher match = data.matcher(dob);
					boolean k = match.matches();
					if (k == true) {
						Employee.dob=dob;
					} else {
						System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
						j++;
					}
					break;
				}
				case 2: {
					String pattern = "^(30)\\/(02|04|06|09|11)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
					Pattern data = Pattern.compile(pattern);
					Matcher match = data.matcher(dob);
					boolean k = match.matches();
					if (k == true) {
						Employee.dob=dob;
					} else {
						System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
						j++;
					}
					break;
				}

				default:
					System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
					j++;
				}
				break;
			}
			default:
				System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
				j++;

			}
			day *= 0;
			month *= 0;
			leap *= 0;
		}

	}

	public void EmployeePhone() {
		int j = 1;
		for (int i = 0; i < j; i++) {
			System.out.println("Enter the phone number");
			String phone = scanner.nextLine();
			String pattern = "^[6-9][0-9]{9}$";
			Pattern phoneNumber = Pattern.compile(pattern);
			Matcher match = phoneNumber.matcher(phone);
			boolean data = match.matches();
			if (data == true) {
				Employee.phone=phone;
			} else {
				j++;
				System.out.println("Phone number is invalid");
			}
		}

	}

	public void EmployeeEmail() {
		int j = 1;
		for (int i = 0; i < j; i++) {
			System.out.println("Enter the email id");
			String email = scanner.nextLine();
			if (email.contains("@")) {
				Employee.email=email;
			} else {
				j++;
				System.out.println("Invalid email id ");
			}
		}
	}

}