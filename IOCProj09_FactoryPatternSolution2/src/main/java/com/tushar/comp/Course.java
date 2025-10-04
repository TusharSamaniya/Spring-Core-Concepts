//depedent class
package com.tushar.comp;

public class Course {
	
	private Long MobileNo;
	private int age;
	private String Mode;
	
	
	
	public Course(Long mobileNo, int age, String mode) {
		System.out.println("Course method called");
		MobileNo = mobileNo;
		this.age = age;
		Mode = mode;
	}



	@Override
	public String toString() {
		return "Course [MobileNo=" + MobileNo + ", age=" + age + ", Mode=" + Mode + "]";
	}
	
	

}
