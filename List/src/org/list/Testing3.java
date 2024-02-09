package org.list;

import java.util.Scanner;

public class Testing3{

   public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the student id");
	int id = scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter the student name");
	String name = scanner.nextLine();
	System.out.println("Enter the student email");
	String email = scanner.nextLine();
	System.out.println("Enter the student phone no");
	long phoneNo = scanner.nextLong();
	scanner.nextLine();
	System.out.println("Enter the student dept");
	String dept = scanner.nextLine();
	System.out.println("Enter the student genter");
	String genter = scanner.nextLine();
	System.out.println("Enter the student city");
	String city = scanner.nextLine();

	System.out.println("Student Id :"+id);
	System.out.println("Student Name :"+name);
	System.out.println("Student Email :"+email);
	System.out.println("Student Phone No :"+phoneNo);
	System.out.println("Student Dept :"+dept);
	System.out.println("Student Genter:"+genter);
	System.out.println("Student City:"+city);
	scanner.close();
}

}