//target class
package com.tushar.comp;

public class Student {
	
	private String Name;
	private int Duration;
	private Course course;
	
	public Student(String name, int duration, Course course) {
		System.out.println("Student class called");
		Name = name;
		Duration = duration;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Duration=" + Duration + ", course=" + course + "] --> " + super.toString();
	}
	
	

}
