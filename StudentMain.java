package com.java.studpro;

import java.util.List;
import java.util.Scanner;

public class StudentMain {
static Scanner sc = new Scanner(System.in);	//static ? we're going add lot of process so static
static StudentDetVali rec = new StudentDetVali();
public static void main(String[] args) {
	int choice;
	do {
		System.out.println("OPTIONS");
		System.out.println("-----------");
		System.out.println("1. Add Student ");
		System.out.println("2. Show Student ");
		System.out.println("6. Exit ");
		System.out.println("Enter the Choice: ");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			try {
				addStudentMain();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			break;
			
		case 2:
			showStudentMain();
			break;
		case 6:
			return;
		}
		
	}while(choice != 6);
}
private static void showStudentMain() {
	// TODO Auto-generated method stub
	List<Student> StuentList = rec.showStudentDetVali();
	System.out.println("The Student list is ");
	for (Student student : StuentList) {
		System.out.println(student);
	}
	
	
}
public static void addStudentMain() throws StudentExceptions {
	
	Student student = new Student();
	
	System.out.println("Enter the Student No: ");
	student.setStudNo(sc.nextInt());
	
	System.out.println("Enter the Student Name: ");
	student.setStudName(sc.next());
	
	System.out.println("Enter the Student Gender(MALE or FEMALE): ");
	String studGender = sc.next();
	if(studGender.equals("MALE")) {
		student.setStudGender(Gender.MALE);
	}
	if(studGender.equals("FEMALE")) {
		student.setStudGender(Gender.FEMALE);
	}
	
	System.out.println("Enter the Student Department: ");
	student.setStudDept(sc.next());
	
	System.out.println("Enter the Student Degree: ");
	student.setStudDesg(sc.next());
	
	System.out.println("Enter the Student Cgpa: ");
	student.setStudCgpa(sc.nextDouble());
	
	System.out.println(rec.addStudentDetVali(student));
}
}
