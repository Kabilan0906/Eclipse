package org.list;

import java.util.Scanner;

public class Testing2{
   public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the student id");
	int studentId = scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter the student name");
	String studentName = scanner.nextLine();
	System.out.println("Enter the Mark1");
	int Mark1 = scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter the Mark2");
	int Mark2 = scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter the Mark3");
	int Mark3 = scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter the Mark4");
	int Mark4 = scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter the Mark5");
	int Mark5 = scanner.nextInt();
	int Total = Mark1+Mark2+Mark3+Mark4+Mark5;
	int Average =Total/5;
	System.out.println("Student id :"+studentId);
	System.out.println("Student name :"+studentName);
	System.out.println("Mark1 :"+Mark1);
	System.out.println("Mark2 :"+Mark2);
	System.out.println("Mark3 :"+Mark3);
	System.out.println("Mark4 :"+Mark4);
	System.out.println("Mark5 :"+Mark5);
	System.out.println("Total :"+Total);
	System.out.println("Average :"+Average);
	scanner.close();
   } 
}