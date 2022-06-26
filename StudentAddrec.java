package com.java.studpro;

import java.util.ArrayList;
import java.util.List;

public class StudentAddrec {
	static List<Student>StudentList;
	static {
		StudentList = new ArrayList<Student>();
	}
	public String addStudentAddrec(Student student) {
		StudentList.add(student);
		return "Student Record Inserted Successfully...";
	}
	public List<Student>showStudentAddrec(){
		return StudentList;
	}
}
