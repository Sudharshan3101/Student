package com.java.studpro;

import java.util.List;

public class StudentDetVali {
	static StringBuilder st = new StringBuilder();
	static StudentAddrec rec = new StudentAddrec();
	
	public List<Student> showStudentDetVali(){
		return rec.showStudentAddrec();
	}
	public String addStudentDetVali(Student student) throws StudentExceptions {
		if(isValid(student) == true) {
			return rec.addStudentAddrec(student);
		}
		return " ";
	}
	public boolean isValid(Student student) throws StudentExceptions {
		boolean flag = true;
		if(student.getStudNo() <= 0) {
			st.append("Student Number can't be Zero or Negative");//Validation 1
			flag = false;
		}
		if(student.getStudName().length() < 5) {
			st.append("Student name Contains Minimum 5 characters"); //Validation 2
			flag = false;
		}
		if(student.getStudDept().length() < 3) {
			st.append("Stuent Department Contains Minimum 2 characters"); //Validation 3
			flag = false;
		}
		if(student.getStudDesg().length()<=4) {
			st.append("Student Degree Contains Minimum 4 Characters"); //Validation 4
			flag = false;
		}
		if(student.getStudCgpa()<6 || student.getStudCgpa()>9.99) {
			st.append("Student CGPA must between 6 and 9.99");  //Validation 5
			flag = false;
		}
		
		/* If all the Conditions are true so we need to return isValid; then exceptions occurs
		 * so write in above line of isValid == false and throw new exception(stringbuilder.tostring())
		 */
		if(flag == false) {
			throw new StudentExceptions(st.toString());
		}
		return flag;
	}
	
	//Now we're going to add StudentAddrec.java so go to 7th line and write.
	
}
