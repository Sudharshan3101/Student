package com.java.studpro;

public class Student {
	private int studNo;
	private String studName;
	private Gender studGender;
	private String studDept;
	private String studDesg;
	private double studCgpa;
	public int getStudNo() {
		return studNo;
	}
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Gender getStudGender() {
		return studGender;
	}
	public void setStudGender(Gender studGender) {
		this.studGender = studGender;
	}
	public String getStudDept() {
		return studDept;
	}
	public void setStudDept(String studDept) {
		this.studDept = studDept;
	}
	public String getStudDesg() {
		return studDesg;
	}
	public void setStudDesg(String studDesg) {
		this.studDesg = studDesg;
	}
	public double getStudCgpa() {
		return studCgpa;
	}
	public void setStudCgpa(double studCgpa) {
		this.studCgpa = studCgpa;
	}
	public Student(int studNo, String studName, Gender studGender, String studDept, String studDesg, double studCgpa) {
		this.studNo = studNo;
		this.studName = studName;
		this.studGender = studGender;
		this.studDept = studDept;
		this.studDesg = studDesg;
		this.studCgpa = studCgpa;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studNo=" + studNo + ", studName=" + studName + ", studGender=" + studGender + ", studDept="
				+ studDept + ", studDesg=" + studDesg + ", studCgpa=" + studCgpa + "]";
	}
	
	
	
}

