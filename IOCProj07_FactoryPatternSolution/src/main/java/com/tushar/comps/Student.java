package com.tushar.comps;

public class Student extends Person{
	
	private int studentId;
	private String course;

	public Student(String name, String aadrs, AadharDetails aadhar, int studentId, String course) {
		super(name, aadrs, aadhar);
		System.out.println("Student::5-param constructor");
		this.studentId = studentId;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [empId=" + studentId + ", course=" + course + "] --->" + super.toString();
	}
	
	

}
